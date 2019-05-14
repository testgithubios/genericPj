package com.product.prj.generic;

public interface Constants {
	
	public static final int RECORD_DEFAULT = 1;
	public static final int PAGE_SIZE_DEFAULT = 10;
	
	public static final String EQUAL = "=";
	public static final String LAGRER = ">";
	public static final String SMALLER = "<";
	public static final String LIKE = "like";
	
	public static final String COMPANY_ALIAS = "company";
	public static final String COMPANY_FIELD_ID = COMPANY_ALIAS+".id";
	public static final String COMPANY_TRANSLATE_ALIAS = "company_t";
	public static final String COMPANY_TRANSLATE_FIELD_ID = COMPANY_TRANSLATE_ALIAS+".companyId";
	public static final String LANGUAGES_ALIAS = "languages";
	public static final String LANGUAGES_FIELD_ID = LANGUAGES_ALIAS+".id";
	public static final String LANGUAGES_FIELD_SHORTNAME = LANGUAGES_ALIAS+".shortName";
}
