package com.product.prj.entity;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Categories.class)
public abstract class Categories_ {

	public static volatile SingularAttribute<Categories, Integer> categoryType;
	public static volatile SingularAttribute<Categories, Long> ParentId;
	public static volatile SingularAttribute<Categories, Long> id;
	public static volatile ListAttribute<Categories, CategoriesTranslate> categoriesTranslates;

	public static final String CATEGORY_TYPE = "categoryType";
	public static final String PARENT_ID = "ParentId";
	public static final String ID = "id";
	public static final String CATEGORIES_TRANSLATES = "categoriesTranslates";

}

