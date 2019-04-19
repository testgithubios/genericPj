package com.product.prj.repositoryIml;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.prj.dto.CategoriesDTO;
import com.product.prj.dto.ResponseDTO;
import com.product.prj.entity.CusLanguages;
import com.product.prj.generic.Constants;
import com.product.prj.generic.ResponseDataConf;
import com.product.prj.repository.LanguagesRepository;

@Service
public class CategoriesRepositoryIml {
	
	@Autowired
	EntityManager em;
	
	@Autowired
	LanguagesRepository languaguesResporitory;
	
	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(long languageId, String name) {
		
		String query = "Select new com.product.prj.dto.CategoriesDTO (ca.id as categoriesId, ca.categoryType as categoryType, ca.ParentId as parentId, cat.name as name) "
					 + "from Categories as ca INNER JOIN CategoriesTranslate as cat "
					 + "on ca.id = cat.categoriesId INNER JOIN CusLanguages as lan "
					 + "on cat.languagesId = lan.id where lan.id = " + languageId;
		
//		String query = "Select ca, cat "
//				 + "from Categories as ca INNER JOIN CategoriesTranslate as cat "
//				 + "on ca.id = cat.categoriesId INNER JOIN CusLanguages as lan "
//				 + "on cat.languagesId = lan.id where lan.id = " + languageId;
//		
		if(StringUtils.isNotBlank(name)) {
			String condition = " and cat.name like '%"+ name +"%'";
			query = StringUtils.appendIfMissingIgnoreCase(query,condition);
		}
		
		List<CategoriesDTO> lst = em.createQuery(query).getResultList();
		
		CusLanguages languages = languaguesResporitory.findById(languageId).get();
		ResponseDataConf<List<CategoriesDTO>> response = new ResponseDataConf<List<CategoriesDTO>>();
		return response.getResponseEntity(HttpStatus.OK, languages.getShortName(), Constants.SEARCH_CATEGORIES_SUCCESS, lst);
	}

}
