package com.product.prj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.dto.CategoriesDTO;
import com.product.prj.entity.Categories;
import com.product.prj.entity.CategoriesTranslate;
import com.product.prj.entity.Languages;
import com.product.prj.repository.CategoriesRepository;
import com.product.prj.repository.CategoriesTranslateRepository;

@Service
@Transactional
public class CategoriesService {

	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@Autowired
	private CategoriesTranslateRepository categoriesTranslateRepository;
	
	@Autowired
	private LanguagesService languagesService;
	
	@Transactional
	public CategoriesDTO saveCategories(CategoriesDTO input) {
		
		Categories categories = categoriesRepository.save(getCategoriesFromDTO(input));
		Languages languages = languagesService.findbyId(input.getLanguagesId());
		CategoriesTranslate categoriesTranslate = categoriesTranslateRepository.save(getCategoriesTranslateFromDTO(categories,languages , input));
		
		CategoriesDTO result = convertDataToDTO(categories, languages, categoriesTranslate);
		return result;
	}
	
	public Categories getCategoriesFromDTO(CategoriesDTO dto) {
		
		Categories categories = new Categories();
		
		categories.setId(dto.getCategoriesId());
		categories.setCategoryType(dto.getCategoryType());
		
		return categories;
	}
	
	public CategoriesTranslate getCategoriesTranslateFromDTO(Categories categories, Languages languages, CategoriesDTO dto) {
		
		CategoriesTranslate categoriesTranslate = new CategoriesTranslate();
		
		categoriesTranslate.setCategories(categories);
		categoriesTranslate.setLanguages(languages);
		categoriesTranslate.setName(dto.getName());
		
		return categoriesTranslate;
	}
	
	public CategoriesDTO convertDataToDTO(Categories categories, Languages languages, CategoriesTranslate categoriesTranslate) {
		
		CategoriesDTO categoriesDTO = new CategoriesDTO();
		
		categoriesDTO.setCategoriesId(categories.getId());
		categoriesDTO.setCategoryType(categories.getCategoryType());
		categoriesDTO.setParentId(categories.getParentId());
		categoriesDTO.setLanguagesId(languages.getId());
		categoriesDTO.setName(categoriesTranslate.getName());
		
		return categoriesDTO;
	}
}
