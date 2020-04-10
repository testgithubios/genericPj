package com.product.prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.prj.services.LanguagesService;

@RestController
@RequestMapping("categories")
@CrossOrigin(allowCredentials = "true")
public class CategoriesController {
	
	@Autowired
	LanguagesService languagesService;
	
}
