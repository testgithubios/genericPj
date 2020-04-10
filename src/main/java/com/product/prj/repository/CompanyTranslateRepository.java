package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.Company;
import com.product.prj.entity.CompanyTranslate;

@Repository
public interface CompanyTranslateRepository  extends JpaRepository<CompanyTranslate, Long> , JpaSpecificationExecutor<CompanyTranslate>{
	
	CompanyTranslate findByCompanyAndLanguageShortName(Company company, String langShortName);
}
