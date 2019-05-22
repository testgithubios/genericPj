package com.product.prj.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.prj.dto.ResponseDTO;
import com.product.prj.entity.CusLanguages;
import com.product.prj.generic.ResponseDataConf;
import com.product.prj.repository.LanguagesRepository;

@RestController
@RequestMapping("languages")
@CrossOrigin(allowCredentials = "true")
public class LanguagesController {

	private final Logger logger = Logger.getLogger(LanguagesController.class);
	
	@Autowired
	LanguagesRepository lanRepository;
	
	@CrossOrigin
	@RequestMapping(value = "/getAllLan", method = RequestMethod.GET)
	public ResponseEntity<ResponseDTO<List<CusLanguages>>> getAllLanguages() {
		List<CusLanguages> lstResult = null;
		ResponseDataConf<List<CusLanguages>> response = new ResponseDataConf<List<CusLanguages>>();
		try {
			
			lstResult = lanRepository.findAll();
			
		}catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() , lstResult);
		}
		return response.getResponseEntity(HttpStatus.OK, lstResult);
	}
}
