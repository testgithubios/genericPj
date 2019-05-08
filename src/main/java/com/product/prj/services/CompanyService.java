package com.product.prj.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.repository.CompanyRepository;
import com.product.prj.repository.CompanyTranslateRepository;
import com.product.prj.repository.LanguagesRepository;

@Service
@Transactional
public class CompanyService {

	private final Logger logger = Logger.getLogger(CompanyService.class);
	
	@Autowired
	private LanguagesRepository languagesRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	CompanyTranslateRepository companyTranslateRepository;
	
	public void saveCompanyInfo() {
		
	}
}
