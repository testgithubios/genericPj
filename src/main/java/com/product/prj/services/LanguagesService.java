package com.product.prj.services;

import java.util.List;

import com.product.prj.entity.CusLanguages;

public interface LanguagesService {
	
	public CusLanguages findbyId(Long id);
	
	public CusLanguages findByShortName(String shortName);
	
	public CusLanguages findByName(String name);
	
	public List<CusLanguages> getAllLanguagues();
}
