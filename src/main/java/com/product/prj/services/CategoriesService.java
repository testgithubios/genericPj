package com.product.prj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.dto.CategoriesDTO;
import com.product.prj.dto.ResponseDTO;
import com.product.prj.entity.Categories;
import com.product.prj.entity.CategoriesTranslate;
import com.product.prj.entity.CusLanguages;
import com.product.prj.generic.Constants;
import com.product.prj.generic.ResponseDataConf;
import com.product.prj.repository.CategoriesRepository;
import com.product.prj.repository.CategoriesTranslateRepository;
import com.product.prj.repositoryIml.CategoriesRepositoryIml;

@Service
@Transactional
public class CategoriesService {
	
	@Autowired
	private CategoriesRepository categoriesRepository;

	@Autowired
	private CategoriesTranslateRepository categoriesTranslateRepository;
	
	@Autowired
	private CategoriesRepositoryIml categoriesIml;

	@Transactional
	public ResponseEntity<ResponseDTO<CategoriesDTO>> saveCategories(CusLanguages languages, CategoriesDTO input) {
		
		Categories categories = categoriesRepository.save(getCategoriesFromDTO(input));
		CategoriesTranslate categoriesTranslate = categoriesTranslateRepository
				.save(getCategoriesTranslateFromDTO(categories, languages, input));
		CategoriesDTO result = convertDataToDTO(categories, categoriesTranslate);
		
		ResponseDataConf<CategoriesDTO> response = new ResponseDataConf<CategoriesDTO>();
		return response.getResponseEntity(HttpStatus.OK, languages.getShortName(), Constants.CREATE_CATEGORIES_SUCCESS, result);
	}
	
	
	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(long languageId, String name) {
		
//		CategoriesSpecification spec = new CategoriesSpecification(new SearchCriteria("name", ":",name));
//		
//		List<Categories> lst = IteratorUtils.toList(categoriesRepository.findAll(spec).iterator());
//		
//		ResponseDataConf<List<Categories>> response = new ResponseDataConf<List<Categories>>();
//		return response.getResponseEntity(HttpStatus.OK, languages.getShortName(), Constants.SEARCH_CATEGORIES_SUCCESS, lst);
		
		return categoriesIml.searchCategories(languageId,name);
	}
	public Categories getCategoriesFromDTO(CategoriesDTO dto) {

		Categories categories = new Categories();

		categories.setId(dto.getCategoriesId());
		categories.setCategoryType(dto.getCategoryType());
		categories.setParentId(dto.getParentId());
		
		return categories;
	}
	
	public CategoriesTranslate getCategoriesTranslateFromDTO(Categories categories, CusLanguages languages,
			CategoriesDTO dto) {

		CategoriesTranslate categoriesTranslate = new CategoriesTranslate();

		categoriesTranslate.setCategories(categories);
		categoriesTranslate.setLanguages(languages);
		categoriesTranslate.setName(dto.getName());
		categoriesTranslate.setCategoriesId(categories.getId());
		categoriesTranslate.setLanguagesId(languages.getId());
		return categoriesTranslate;
	}

	public CategoriesDTO convertDataToDTO(Categories categories, CategoriesTranslate categoriesTranslate) {

		CategoriesDTO categoriesDTO = new CategoriesDTO();

		categoriesDTO.setCategoriesId(categories.getId());
		categoriesDTO.setCategoryType(categories.getCategoryType());
		categoriesDTO.setParentId(categories.getParentId());
		categoriesDTO.setName(categoriesTranslate.getName());

		return categoriesDTO;
	}
}
