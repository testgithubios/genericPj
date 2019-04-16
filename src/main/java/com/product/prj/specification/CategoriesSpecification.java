package com.product.prj.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.product.prj.entity.*;
import org.springframework.data.jpa.domain.Specification;

public class CategoriesSpecification implements Specification<Categories> {

	private static final long serialVersionUID = -1431931294221662922L;
	private SearchCriteria criteria;

	public CategoriesSpecification(SearchCriteria criteria) {
		this.criteria = criteria;
	}
	
	@Override
	public Predicate toPredicate(Root<Categories> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		
		Join<Categories,CategoriesTranslate> joinCategoriesTranslate = root.join(Categories_.categoriesTranslates);
		Join<CategoriesTranslate, CusLanguages> joinLanguages = joinCategoriesTranslate.join(CategoriesTranslate_.languages);
		if(criteria != null) {
			if (criteria.getOperation().equalsIgnoreCase(">")) {
				return builder.greaterThanOrEqualTo(joinLanguages.get(criteria.getKey()), criteria.getValue().toString());
			} else if (criteria.getOperation().equalsIgnoreCase("<")) {
				return builder.lessThanOrEqualTo(joinLanguages.get(criteria.getKey()), criteria.getValue().toString());
			} else if (criteria.getOperation().equalsIgnoreCase(":")) {
				if (joinLanguages.get(criteria.getKey()).getJavaType() == String.class) {
					return builder.like(joinLanguages.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
				} else {
					return builder.equal(joinLanguages.get(criteria.getKey()), criteria.getValue());
				}
			}
		}
		return null;
	}
}
