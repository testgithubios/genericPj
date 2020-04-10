package com.product.prj.servicesIml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.entity.Company;
import com.product.prj.entity.CompanyTranslate;
import com.product.prj.repository.CompanyRepository;
import com.product.prj.repository.CompanyTranslateRepository;
import com.product.prj.services.CompanyTranslateService;

@Service
@Transactional
public class CompanyTranslateServiceIml implements CompanyTranslateService{
	
	@Autowired
	CompanyTranslateRepository companyTranslateRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	public CompanyTranslate getDefaultConpany(String langShortName) {
		Company company = companyRepository.findByIsDefault(true);
		return companyTranslateRepository.findByCompanyAndLanguageShortName(company, langShortName);
	}
}
