package com.product.prj.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.dto.CategoriesDTO;
import com.product.prj.dto.CompanyDTO;
import com.product.prj.dto.ResponseDTO;
import com.product.prj.entity.Company;
import com.product.prj.entity.CompanyTranslate;
import com.product.prj.entity.Company_;
import com.product.prj.entity.CusLanguages;
import com.product.prj.generic.Constants;
import com.product.prj.generic.ResponseDataConf;
import com.product.prj.generic.SearchObj;
import com.product.prj.repository.CompanyRepository;
import com.product.prj.repository.CompanyTranslateRepository;
import com.product.prj.repository.LanguagesRepository;
import com.product.prj.repositoryIml.CompanyRepositoryIml;

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
	
	@Autowired
	CompanyRepositoryIml companyRepositoryIml;
	
	@Transactional
	public ResponseEntity<ResponseDTO<CompanyDTO>> saveCompanyInfo(CompanyDTO companyDTO) {
		CompanyDTO result = null;
		try {
			CusLanguages language = companyDTO.getLanguage();
			Company company = companyRepository.save(getCompanyFromDTO(companyDTO));
			CompanyTranslate companyTranslate = companyTranslateRepository.save(getCompanyTranslateFromDTO(companyDTO, company, language));
			
			result = convertEntityToDTO(company, companyTranslate, language);
		}catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			logger.error(ex.getMessage(), ex);
			ResponseDataConf<CompanyDTO> response = new ResponseDataConf<CompanyDTO>();
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() ,result);
		}
		
		ResponseDataConf<CompanyDTO> response = new ResponseDataConf<CompanyDTO>();
		return response.getResponseEntity(HttpStatus.OK,result);
	}
	
	public ResponseEntity<ResponseDTO<CompanyDTO>> getDefaultCompanyInfo(Optional<String> languageSortName, Integer pageIndex, Integer pageSize) {
		CompanyDTO result = null;
		ResponseDataConf<CompanyDTO> response = new ResponseDataConf<CompanyDTO>();
		
		try {
			List<SearchObj> conditions = new ArrayList<>();
			conditions.add(new SearchObj(Constants.COMPANY_ALIAS+"."+Company_.IS_DEFAULT, "true", Constants.EQUAL));
			List<CompanyDTO> lst = companyRepositoryIml.getCompanies(languageSortName, conditions, pageIndex, pageSize);
			result = lst.get(0);
		}catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() ,null);
		}
		
		return response.getResponseEntity(HttpStatus.OK, result);
	}
	
	public Company getCompanyFromDTO(CompanyDTO companyDTO) {
		Company company = new Company(
				companyDTO.getId(), companyDTO.getPhone1(), companyDTO.getPhone2(),
				companyDTO.getFacebookLink(), companyDTO.getYoutupeLink(), companyDTO.getInstagramLink(), 
				companyDTO.getLogo(), companyDTO.getBanner(), companyDTO.getIsDefault()
		);
		
		return company;
	}
	
	public CompanyTranslate getCompanyTranslateFromDTO(CompanyDTO companyDTO, Company company, CusLanguages language) {
		CompanyTranslate companyTranslate = new CompanyTranslate(
			company.getId(), language.getId(), company, language, 
			companyDTO.getName(), companyDTO.getAddress()
		);
		
		return companyTranslate;
	}
	
	public CompanyDTO convertEntityToDTO(Company company, CompanyTranslate companyTranslate, CusLanguages cuslanguage) {
		CompanyDTO dto = new CompanyDTO(
			company.getId(), companyTranslate.getName(), company.getPhone1(), 
			company.getPhone2(), company.getFacebookLink(), company.getYoutupeLink(), 
			company.getInstagramLink(), company.getLogo(), company.getBanner(), companyTranslate.getAddress(), 
			cuslanguage.getId(), cuslanguage, company.getIsDefault()
		);
		
		return dto;
	}
}
