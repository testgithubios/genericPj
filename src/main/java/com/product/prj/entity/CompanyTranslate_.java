package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CompanyTranslate.class)
public abstract class CompanyTranslate_ {

	public static volatile SingularAttribute<CompanyTranslate, String> address;
	public static volatile SingularAttribute<CompanyTranslate, Languages> languages;
	public static volatile SingularAttribute<CompanyTranslate, String> name;
	public static volatile SingularAttribute<CompanyTranslate, Categories> categories;

	public static final String ADDRESS = "address";
	public static final String LANGUAGES = "languages";
	public static final String NAME = "name";
	public static final String CATEGORIES = "categories";

}

