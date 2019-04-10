package com.product.prj.repositoryIml;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.product.prj.entity.Categories;
import com.product.prj.entity.Categories_;
import com.product.prj.repository.CategoriesRepository;
import com.product.prj.repository.CategoriesTranslateRepository;
import com.product.prj.repository.LanguagesRepository;

public class CategoriesRepositoryIml {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Autowired
	CategoriesTranslateRepository categoriesTranslateRepository;
	
	@Autowired
	LanguagesRepository languagesRepository;
	
	public List<Categories> searchCategories(String name) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Categories> queryCategories = builder.createQuery(Categories.class);
		Root<Categories> categories = queryCategories.from(Categories.class);
//		Join<Categories,CategoriesTranslate> join = categories.join(Categories_.CATEGORIES_TRANSLATES);
		categories.join(Categories_.CATEGORIES_TRANSLATES);
		queryCategories.select(categories);
		System.out.println("query "+queryCategories);
		TypedQuery<Categories> typedQuery = entityManager.createQuery(queryCategories);
        return typedQuery.getResultList();
	}
}
