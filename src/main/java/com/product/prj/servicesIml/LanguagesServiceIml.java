package com.product.prj.servicesIml;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.controller.LanguagesController;
import com.product.prj.entity.CusLanguages;
import com.product.prj.repository.LanguagesRepository;
import com.product.prj.services.LanguagesService;

@Service
@Transactional
public class LanguagesServiceIml implements LanguagesService{
	
	private final Logger logger = Logger.getLogger(LanguagesController.class);
	
	@Autowired
	LanguagesRepository languagesRepository;
	
	public CusLanguages findbyId(Long id) {
		return languagesRepository.findById(id).get();
	}
	
	public CusLanguages findByShortName(String shortName) {
		return languagesRepository.findByShortName(shortName);
	}
	
	public CusLanguages findByName(String name) {
		return languagesRepository.findByName(name);
	}
	
	public List<CusLanguages> getAllLanguagues(){
		return languagesRepository.findAll();
	}
}
