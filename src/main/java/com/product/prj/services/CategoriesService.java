package com.product.prj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.repository.CategoriesRepository;
import com.product.prj.repository.CategoriesTranslateRepository;

@Service
@Transactional
public class CategoriesService {

	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@Autowired
	private CategoriesTranslateRepository categoriesTranslateRepository;
}
