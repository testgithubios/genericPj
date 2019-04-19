package com.product.prj.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	private final Logger logger = Logger.getLogger(CategoriesController.class);
	
	@Autowired
	CategoriesService categoriesService;
	
	@Autowired
	LanguagesService languagesService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO<CategoriesDTO>> addCategory(
		@RequestHeader(value = "languageId") Long languageId,
		@RequestBody CategoriesDTO categoriesDTO){
		CusLanguages languages = languagesService.findbyId(languageId);
		return categoriesService.saveCategories(languages, categoriesDTO);
	}
	
	@RequestMapping(value = "/searchCategories", method = RequestMethod.GET)
	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(
		@RequestHeader(value = "languageId") Long languageId,
		@RequestParam(required = false) String name){
		
		return categoriesService.searchCategories(languageId,name);
	}
	
	
	/*
	 * Test Using @PathVariable
	 */
	
//	@GetMapping({"/searchCategories/{name}", "/searchCategories/"})
//	public ResponseEntity<ResponseDTO<List<CategoriesDTO>>> searchCategories(
//		@RequestHeader(value = "languageId") Long languageId,
//		@PathVariable(required = false) String name){
//		
//		return categoriesService.searchCategories(languageId,name);
//	}
}
