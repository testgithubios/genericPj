package com.product.prj.repositoryIml;

import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.product.prj.entity.Categories;
import com.product.prj.repository.CategoriesRepository;
import com.product.prj.repository.CategoriesTranslateRepository;
import com.product.prj.repository.LanguagesRepository;

public class CategoriesRepositoryIml {
	
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Autowired
	CategoriesTranslateRepository categoriesTranslateRepository;
	
	@Autowired
	LanguagesRepository languagesRepository;
	
	public List<Categories> searchCategories(String name) {
//		CategoriesSpecification spec = new CategoriesSpecification();
		List<Categories> lst = IteratorUtils.toList(categoriesRepository.findAll().iterator());
		return lst;
	}
}
