package com.product.prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.prj.dto.CompanyDTO;
import com.product.prj.dto.ResponseDTO;
import com.product.prj.services.CompanyService;

@RestController
@RequestMapping("companies")
@CrossOrigin(allowCredentials = "true")
public class CompaniesController {

	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value = "/getCompanyInfo/{shortNameLang}", method = RequestMethod.GET)
	public ResponseEntity<ResponseDTO<CompanyDTO>> searchCategories(
		@PathVariable String shortNameLang){
		
		return companyService.getCompanyInfo(shortNameLang, null, null);
	}
}
