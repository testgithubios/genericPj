package com.product.prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.prj.entity.CompanyTranslate;
import com.product.prj.services.CompanyTranslateService;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin(allowCredentials = "true")
public class CompaniesController {

	
	@Autowired
	CompanyTranslateService companyTranslateService;
	
	@RequestMapping(value = {"/getCompanyInfo/{shortNameLang}"}, method = RequestMethod.GET)
	public ResponseEntity<CompanyTranslate> searchCategories(@PathVariable String shortNameLang){
		
		CompanyTranslate companyTranslate = companyTranslateService.getDefaultConpany(shortNameLang);
		return new ResponseEntity<>(companyTranslate, HttpStatus.OK);
	}
}
