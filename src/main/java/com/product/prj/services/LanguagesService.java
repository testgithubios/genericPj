package com.product.prj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.prj.entity.CusLanguages;
import com.product.prj.repository.LanguagesRepository;

@Service
@Transactional
public class LanguagesService {

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
