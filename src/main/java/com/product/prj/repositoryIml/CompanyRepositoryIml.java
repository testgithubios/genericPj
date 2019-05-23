package com.product.prj.repositoryIml;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.prj.dto.CompanyDTO;
import com.product.prj.generic.Constants;
import com.product.prj.generic.GenericMethod;
import com.product.prj.generic.SearchObj;
import com.product.prj.repository.LanguagesRepository;

@Service
public class CompanyRepositoryIml {

private final Logger logger = Logger.getLogger(CompanyRepositoryIml.class);
	
	@Autowired
	EntityManager em;
	
	@Autowired
	LanguagesRepository languaguesResporitory;
	
	@SuppressWarnings("unchecked")
	public List<CompanyDTO> getCompanies(Optional<String> shortNameLang, List<SearchObj> searchObjs,Integer lastRecord, Integer pageSize) {
		List<CompanyDTO> lst = null;
		String sql = "Select new com.product.prj.dto.CompanyDTO("
				+ Constants.COMPANY_ALIAS_FIELD_ID +", " + Constants.COMPANY_TRANSLATE_ALIAS_FIELD_NAME+", "
				+ Constants.COMPANY_ALIAS_FIELD_PHONE1+", "+Constants.COMPANY_ALIAS_FIELD_PHONE2+", "
				+ Constants.COMPANY_ALIAS_FIELD_FACEBOOK_LINK+", "+Constants.COMPANY_ALIAS_FIELD_YOUTUPE_LINK+", "
				+ Constants.COMPANY_ALIAS_FIELD_INSTAGRAM_LINK+", "
				+ Constants.COMPANY_ALIAS_FIELD_LOGO+", "+Constants.COMPANY_ALIAS_FIELD_BANNER+", "
				+ Constants.COMPANY_TRANSLATE_ALIAS_FIELD_ADDRESS+", "+Constants.LANGUAGES_FIELD_ID
				+ " )"
				+ " from Company as "+ Constants.COMPANY_ALIAS +" INNER JOIN CompanyTranslate as " + Constants.COMPANY_TRANSLATE_ALIAS
				+ " on "+ Constants.COMPANY_ALIAS_FIELD_ID +" =  " + Constants.COMPANY_TRANSLATE_ALIAS_FIELD_ID + " INNER JOIN CusLanguages as " + Constants.LANGUAGES_ALIAS
				+ " on "+ Constants.COMPANY_TRANSLATE_ALIAS_FIELD_LANGUAGES_ID+" = " + Constants.LANGUAGES_FIELD_ID;
		
		String firstCondition = (shortNameLang.isPresent() && StringUtils.isNotBlank(shortNameLang.get()))?
				" where " + Constants.LANGUAGES_FIELD_SHORTNAME + " = '" + shortNameLang.get()+"'" 
				: " where " + Constants.LANGUAGES_FIELD_ISDEFAULT + " = true";
		sql = StringUtils.appendIfMissingIgnoreCase(sql,firstCondition);
		
		for (SearchObj searchObj : searchObjs) {
			if(searchObj != null) {
				String condition = " and "+ GenericMethod.getConditionFromConditionObj(searchObj);
				sql = StringUtils.appendIfMissingIgnoreCase(sql,condition);
			}
		}
		
		Query query = em.createQuery(sql);
		try {
			if(lastRecord != null && pageSize != null) {
				query.setFirstResult(lastRecord -1).setMaxResults(pageSize);
			}
			lst = query.getResultList();
		}catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			throw ex;
		}
		return lst;
	}
}
