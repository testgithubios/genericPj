package com.product.prj.services;

import java.util.List;

import org.apache.log4j.Logger;
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
import com.product.prj.generic.ResponseDataConf;
import com.product.prj.repository.CategoriesRepository;
import com.product.prj.repository.CategoriesTranslateRepository;
import com.product.prj.repository.LanguagesRepository;
import com.product.prj.repositoryIml.CategoriesRepositoryIml;

@Service
@Transactional
public class CategoriesService {
	
	private final Logger logger = Logger.getLogger(CategoriesService.class);
	
	@Autowired
	private CategoriesRepository categoriesRepository;

	@Autowired
	private CategoriesTranslateRepository categoriesTranslateRepository;
	
	@Autowired
	private CategoriesRepositoryIml categoriesIml;

	@Autowired
	private LanguagesRepository languagesRepository;
	
	@Transactional
	public ResponseEntity<ResponseDTO<CategoriesDTO>> saveCategories(CategoriesDTO input) {
		
		CategoriesDTO result = null;
		try {
			Categories categories = categoriesRepository.save(getCategoriesFromDTO(input));
			CusLanguages languages = languagesRepository.findById(input.getLanguageId()).get();
			CategoriesTranslate categoriesTranslate = categoriesTranslateRepository
					.save(getCategoriesTranslateFromDTO(categories, languages, input));
			result = convertDataToDTO(categories, categoriesTranslate);
		}catch (Exception ex) {
			// TODO: handle exception
			logger.error(ex.getMessage(), ex);
			ResponseDataConf<CategoriesDTO> response = new ResponseDataConf<CategoriesDTO>();
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() ,result);
		}
		
		ResponseDataConf<CategoriesDTO> response = new ResponseDataConf<CategoriesDTO>();
		return response.getResponseEntity(HttpStatus.OK,result);
	}
	
	
	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(String shortNameLang, String name, Integer lastRecord, Integer pageSize) {
		
		return categoriesIml.searchCategories(shortNameLang,name, lastRecord, pageSize);
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
