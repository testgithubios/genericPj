package com.product.prj.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.product.prj.entity.Categories;
import com.product.prj.entity.Categories_;

public class CategoriesSpecification implements Specification<Categories> {

	private static final long serialVersionUID = -1431931294221662922L;
	private SearchCriteria criteria;

	@Override
	public Predicate toPredicate(Root<Categories> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		
		root.join(Categories_.CATEGORIES_TRANSLATES);

		if(criteria != null) {
			if (criteria.getOperation().equalsIgnoreCase(">")) {
				return builder.greaterThanOrEqualTo(root.<String>get(criteria.getKey()), criteria.getValue().toString());
			} else if (criteria.getOperation().equalsIgnoreCase("<")) {
				return builder.lessThanOrEqualTo(root.<String>get(criteria.getKey()), criteria.getValue().toString());
			} else if (criteria.getOperation().equalsIgnoreCase(":")) {
				if (root.get(criteria.getKey()).getJavaType() == String.class) {
					return builder.like(root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
				} else {
					return builder.equal(root.get(criteria.getKey()), criteria.getValue());
				}
			}
		}
		return null;
	}
}
