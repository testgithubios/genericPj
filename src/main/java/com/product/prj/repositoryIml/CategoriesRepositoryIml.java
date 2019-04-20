package com.product.prj.repositoryIml;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.prj.dto.CategoriesDTO;
import com.product.prj.dto.ResponseDTO;
import com.product.prj.generic.ResponseDataConf;
import com.product.prj.repository.LanguagesRepository;

@Service
public class CategoriesRepositoryIml {
	
	private final Logger logger = Logger.getLogger(CategoriesRepositoryIml.class);
	
	@Autowired
	EntityManager em;
	
	@Autowired
	LanguagesRepository languaguesResporitory;
	@SuppressWarnings("unchecked")
	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(long languageId, String name) {
		
		String query = "Select new com.product.prj.dto.CategoriesDTO (ca.id as categoriesId, ca.categoryType as categoryType, ca.ParentId as parentId, cat.name as name) "
					 + "from Categories as ca INNER JOIN CategoriesTranslate as cat "
					 + "on ca.id = cat.categoriesId INNER JOIN CusLanguages as lan "
					 + "on cat.languagesId = lan.id where lan.id = " + languageId;
		
		if(StringUtils.isNotBlank(name)) {
			String condition = " and cat.name like '%"+ name +"%'";
			query = StringUtils.appendIfMissingIgnoreCase(query,condition);
		}
		
		List<CategoriesDTO> lst = null;
		
		try {
			lst = em.createQuery(query).getResultList();
		}catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			ResponseDataConf<List<CategoriesDTO>> response = new ResponseDataConf<List<CategoriesDTO>>();
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() ,lst);
		}
		
		ResponseDataConf<List<CategoriesDTO>> response = new ResponseDataConf<List<CategoriesDTO>>();
		return response.getResponseEntity(HttpStatus.OK, lst);
	}

}
