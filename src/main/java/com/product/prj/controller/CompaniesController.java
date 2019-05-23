package com.product.prj.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = {"/getCompanyInfo/{shortNameLang}","/getCompanyInfo"}, method = RequestMethod.GET)
	public ResponseEntity<ResponseDTO<CompanyDTO>> searchCategories(
		@PathVariable Optional<String> shortNameLang){
		
		return companyService.getDefaultCompanyInfo(shortNameLang, null, null);
	}
	
	@PostMapping("/update")
	public ResponseEntity<ResponseDTO<CompanyDTO>> updateCompanyInfo(@RequestBody  CompanyDTO companyDto) {
		return companyService.saveCompanyInfo(companyDto);
	}
}
