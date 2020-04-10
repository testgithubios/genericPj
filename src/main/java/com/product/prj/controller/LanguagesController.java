package com.product.prj.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.prj.entity.CusLanguages;
import com.product.prj.generic.HeaderUtil;
import com.product.prj.repository.LanguagesRepository;
import com.product.prj.services.LanguagesService;

@RestController
@RequestMapping("/api/languages")
@CrossOrigin(allowCredentials = "true")
public class LanguagesController {

	private final Logger logger = Logger.getLogger(LanguagesController.class);
	
	@Autowired
	LanguagesService languagesService;
	
	@CrossOrigin
	@RequestMapping(value = "/getAllLan", method = RequestMethod.GET)
	public ResponseEntity<List<CusLanguages>> getAllLanguages(Pageable pageable) {
		List<CusLanguages> lstResult = null;
		try {
			
			lstResult = languagesService.getAllLanguagues();
			
		}catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ex)).body(null);
		}
		return new ResponseEntity<>(lstResult, HttpStatus.OK);
	}
}
