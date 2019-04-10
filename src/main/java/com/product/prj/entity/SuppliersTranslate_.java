package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SuppliersTranslate.class)
public abstract class SuppliersTranslate_ {

	public static volatile SingularAttribute<SuppliersTranslate, String> note;
	public static volatile SingularAttribute<SuppliersTranslate, Languages> languages;
	public static volatile SingularAttribute<SuppliersTranslate, String> address2;
	public static volatile SingularAttribute<SuppliersTranslate, String> city;
	public static volatile SingularAttribute<SuppliersTranslate, String> contactName;
	public static volatile SingularAttribute<SuppliersTranslate, String> address1;
	public static volatile SingularAttribute<SuppliersTranslate, String> companyName;
	public static volatile SingularAttribute<SuppliersTranslate, Categories> categories;
	public static volatile SingularAttribute<SuppliersTranslate, String> state;

	public static final String NOTE = "note";
	public static final String LANGUAGES = "languages";
	public static final String ADDRESS2 = "address2";
	public static final String CITY = "city";
	public static final String CONTACT_NAME = "contactName";
	public static final String ADDRESS1 = "address1";
	public static final String COMPANY_NAME = "companyName";
	public static final String CATEGORIES = "categories";
	public static final String STATE = "state";

}

