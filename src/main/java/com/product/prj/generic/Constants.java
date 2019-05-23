package com.product.prj.generic;

import com.product.prj.entity.CompanyImg_;
import com.product.prj.entity.CompanyTranslate_;
import com.product.prj.entity.Company_;
import com.product.prj.entity.CusLanguages_;

public interface Constants {
	
	public static final int RECORD_DEFAULT = 1;
	public static final int PAGE_SIZE_DEFAULT = 10;
	
	public static final String EQUAL = "=";
	public static final String LAGRER = ">";
	public static final String SMALLER = "<";
	public static final String LIKE = "like";
	
	public static final String COMPANY_ALIAS = "company";
	public static final String COMPANY_ALIAS_FIELD_ID = COMPANY_ALIAS+"."+Company_.ID;
	public static final String COMPANY_ALIAS_FIELD_PHONE1 = COMPANY_ALIAS+"."+Company_.PHONE1;
	public static final String COMPANY_ALIAS_FIELD_PHONE2 = COMPANY_ALIAS+"."+Company_.PHONE2;
	public static final String COMPANY_ALIAS_FIELD_FACEBOOK_LINK = COMPANY_ALIAS+"."+Company_.FACEBOOK_LINK;
	public static final String COMPANY_ALIAS_FIELD_YOUTUPE_LINK = COMPANY_ALIAS+"."+Company_.YOUTUPE_LINK;
	public static final String COMPANY_ALIAS_FIELD_INSTAGRAM_LINK = COMPANY_ALIAS+"."+Company_.INSTAGRAM_LINK;
	public static final String COMPANY_ALIAS_FIELD_LOGO = COMPANY_ALIAS+"."+Company_.LOGO;
	public static final String COMPANY_ALIAS_FIELD_BANNER = COMPANY_ALIAS+"."+Company_.BANNER;
	
	
	public static final String COMPANY_TRANSLATE_ALIAS = "company_t";
	public static final String COMPANY_TRANSLATE_ALIAS_FIELD_ID = COMPANY_TRANSLATE_ALIAS+"."+ CompanyTranslate_.COMPANY_ID;
	public static final String COMPANY_TRANSLATE_ALIAS_FIELD_NAME = COMPANY_TRANSLATE_ALIAS+"."+ CompanyTranslate_.NAME;
	public static final String COMPANY_TRANSLATE_ALIAS_FIELD_ADDRESS = COMPANY_TRANSLATE_ALIAS+"."+ CompanyTranslate_.ADDRESS;
	public static final String COMPANY_TRANSLATE_ALIAS_FIELD_LANGUAGES_ID = COMPANY_TRANSLATE_ALIAS+"."+ CompanyTranslate_.LANGUAGES_ID;
	
	public static final String COMPANY_IMG_ALIAS = "comImg";
	public static final String COMPANY_IMG_FIELD_ID = COMPANY_IMG_ALIAS +"." + CompanyImg_.COMPANY + "."+Company_.ID;
	
	public static final String LANGUAGES_ALIAS = "languages";
	public static final String LANGUAGES_FIELD_ID = LANGUAGES_ALIAS+"." + CusLanguages_.ID;
	public static final String LANGUAGES_FIELD_SHORTNAME = LANGUAGES_ALIAS+"."+ CusLanguages_.SHORT_NAME;
	public static final String LANGUAGES_FIELD_ISDEFAULT = LANGUAGES_ALIAS+"."+ CusLanguages_.IS_DEFAULT;
	
}
