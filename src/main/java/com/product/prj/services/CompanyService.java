package com.product.prj.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.dto.CompanyDTO;
import com.product.prj.entity.Company;
import com.product.prj.entity.CompanyTranslate;
import com.product.prj.entity.CusLanguages;
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
	
	@Transactional
	public void saveCompanyInfo(CompanyDTO companyDTO) {
		CusLanguages language = languagesRepository.findById(companyDTO.getLanguageId()).get();
		
	}
	
	public Company getCompanyFromDTO(CompanyDTO companyDTO) {
		Company company = new Company();
		
		company.setId(companyDTO.getId());
		company.setBanner(companyDTO.getBanner());
		company.setFacebookLink(companyDTO.getFacebookLink());
		company.setInstagramLink(companyDTO.getInstagramLink());
		company.setLogo(companyDTO.getLogo());
		company.setPhone1(company.getPhone1());
		company.setPhone2(companyDTO.getPhone2());
		company.setYoutupeLink(companyDTO.getYoutupeLink());
		
		return company;
	}
	
	public CompanyTranslate getCompanyTranslateFromDTO(CompanyDTO companyDTO, Company company, CusLanguages language) {
		CompanyTranslate companyTranslate = new CompanyTranslate();
		
		companyTranslate.setAddress(companyDTO.getAddress());
		companyTranslate.setCompany(company);
		companyTranslate.setLanguages(language);
		companyTranslate.setName(companyDTO.getName());
		
		return companyTranslate;
	}
}
