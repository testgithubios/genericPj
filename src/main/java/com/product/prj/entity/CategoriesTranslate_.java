package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CategoriesTranslate.class)
public abstract class CategoriesTranslate_ {

	public static volatile SingularAttribute<CategoriesTranslate, Languages> languages;
	public static volatile SingularAttribute<CategoriesTranslate, String> name;
	public static volatile SingularAttribute<CategoriesTranslate, Long> categoriesId;
	public static volatile SingularAttribute<CategoriesTranslate, Categories> categories;
	public static volatile SingularAttribute<CategoriesTranslate, Long> languagesId;

	public static final String LANGUAGES = "languages";
	public static final String NAME = "name";
	public static final String CATEGORIES_ID = "categoriesId";
	public static final String CATEGORIES = "categories";
	public static final String LANGUAGES_ID = "languagesId";

}

