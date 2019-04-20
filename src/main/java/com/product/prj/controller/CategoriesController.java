package com.product.prj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.prj.dto.CategoriesDTO;
import com.product.prj.dto.ResponseDTO;
import com.product.prj.entity.CusLanguages;
import com.product.prj.services.CategoriesService;
import com.product.prj.services.LanguagesService;

@RestController
@RequestMapping("categories")
@CrossOrigin(allowCredentials = "true")
public class CategoriesController {
	
	@Autowired
	CategoriesService categoriesService;
	
	@Autowired
	LanguagesService languagesService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO<CategoriesDTO>> addCategory(
		@RequestBody CategoriesDTO categoriesDTO){
		return categoriesService.saveCategories(categoriesDTO);
	}
	
	@RequestMapping(value = "/searchCategories/{shortNameLang}", method = RequestMethod.GET)
	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(
		@PathVariable String shortNameLang,
		@RequestParam(required = false) String name,
		@RequestParam(required = false) Integer page_record,
		@RequestParam(required = false) Integer page_size){
		
		return categoriesService.searchCategories(shortNameLang,name,page_record,page_size);
	}
	
	
//	@RequestMapping(value = "/searchCategories/{shortNameLang}/{name}/{page_record}/{page_size}", method = RequestMethod.GET)
//	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(
//		@PathVariable String shortNameLang,
//		@PathVariable(required = false) Optional<String> name,
//		@PathVariable(required = false) Optional<Integer> page_record,
//		@PathVariable(required = false) Optional<Integer> page_size){
//		
//		return categoriesService.searchCategories(shortNameLang,name.get(),page_record.get(),page_size.get());
//	}
}
