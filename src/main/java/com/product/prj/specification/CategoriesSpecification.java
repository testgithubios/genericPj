package com.product.prj.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.product.prj.entity.Categories;
import com.product.prj.entity.CategoriesTranslate;
import com.product.prj.entity.CusLanguages;

public class CategoriesSpecification implements Specification<Categories> {

	private static final long serialVersionUID = -1431931294221662922L;
	private SearchCriteria criteria;

	public CategoriesSpecification(SearchCriteria criteria) {
		this.criteria = criteria;
	}
	
	@Override
	public Predicate toPredicate(Root<Categories> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		
		Join<Categories,CategoriesTranslate> joinCategoriesTranslate = root.join("categoriesTranslates");
		Join<CategoriesTranslate, CusLanguages> joinLanguages = joinCategoriesTranslate.join("languages");
		if(criteria != null) {
			if (criteria.getOperation().equalsIgnoreCase(">")) {
				return builder.greaterThanOrEqualTo(joinCategoriesTranslate.get(criteria.getKey()), criteria.getValue().toString());
			} else if (criteria.getOperation().equalsIgnoreCase("<")) {
				return builder.lessThanOrEqualTo(joinCategoriesTranslate.get(criteria.getKey()), criteria.getValue().toString());
			} else if (criteria.getOperation().equalsIgnoreCase(":")) {
				if (joinCategoriesTranslate.get(criteria.getKey()).getJavaType() == String.class) {
					return builder.like(joinCategoriesTranslate.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
				} else {
					return builder.equal(joinCategoriesTranslate.get(criteria.getKey()), criteria.getValue());
				}
			}
			
//			if(criteria.getOperation().equalsIgnoreCase("languagesId")) {
//				return builder.equal(joinLanguages.get("languages_id"), criteria.getValue());
//			}
		}
		return null;
	}
}
