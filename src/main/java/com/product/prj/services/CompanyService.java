package com.product.prj.services;

import java.util.ArrayList;
import java.util.List;

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
			CusLanguages language = languagesRepository.findById(companyDTO.getLanguageId()).get();
			Company company = companyRepository.save(getCompanyFromDTO(companyDTO));
			CompanyTranslate companyTranslate = companyTranslateRepository.save(getCompanyTranslateFromDTO(companyDTO, company, language));
			
			result = convertEntityToDTO(company, companyTranslate, language);
		}catch (Exception ex) {
			// TODO: handle exception
			logger.error(ex.getMessage(), ex);
			ResponseDataConf<CompanyDTO> response = new ResponseDataConf<CompanyDTO>();
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() ,result);
		}
		
		ResponseDataConf<CompanyDTO> response = new ResponseDataConf<CompanyDTO>();
		return response.getResponseEntity(HttpStatus.OK,result);
	}
	
	public ResponseEntity<ResponseDTO<CompanyDTO>> getCompanyInfo(String languageSortName, Integer pageIndex, Integer pageSize) {
		CompanyDTO result = null;
		ResponseDataConf<CompanyDTO> response = new ResponseDataConf<CompanyDTO>();
		
		try {
			List<SearchObj> conditions = new ArrayList<>();
			conditions.add(new SearchObj(Constants.COMPANY_ALIAS+Company_.IS_DEFAULT, "true", Constants.EQUAL));
			List<CompanyDTO> lst = companyRepositoryIml.getCompanies(languageSortName, conditions, pageIndex, pageSize);
			result = lst.get(0);
		}catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			return response.getResponseEntityWithMessage(HttpStatus.BAD_REQUEST,ex.getMessage() ,null);
		}
		
		return response.getResponseEntity(HttpStatus.OK, result);
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
	
	public CompanyDTO convertEntityToDTO(Company company, CompanyTranslate companyTranslate, CusLanguages cuslanguage) {
		CompanyDTO dto = new CompanyDTO();
		
		dto.setId(company.getId());
		dto.setBanner(company.getBanner());
		dto.setFacebookLink(company.getFacebookLink());
		dto.setInstagramLink(company.getInstagramLink());
		dto.setLogo(company.getLogo());
		dto.setPhone1(company.getPhone1());
		dto.setPhone2(company.getPhone2());
		dto.setYoutupeLink(company.getYoutupeLink());
		dto.setAddress(companyTranslate.getAddress());
		dto.setLanguageId(cuslanguage.getId());
		dto.setName(companyTranslate.getName());
		
		return dto;
	}
}
