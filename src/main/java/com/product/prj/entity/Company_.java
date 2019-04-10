package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Company.class)
public abstract class Company_ {

	public static volatile SingularAttribute<Company, String> instagramLink;
	public static volatile SingularAttribute<Company, String> youtupeLink;
	public static volatile SingularAttribute<Company, String> phone2;
	public static volatile SingularAttribute<Company, String> logo;
	public static volatile SingularAttribute<Company, String> banner;
	public static volatile SingularAttribute<Company, Long> id;
	public static volatile SingularAttribute<Company, String> facebookLink;
	public static volatile SingularAttribute<Company, String> phone1;

	public static final String INSTAGRAM_LINK = "instagramLink";
	public static final String YOUTUPE_LINK = "youtupeLink";
	public static final String PHONE2 = "phone2";
	public static final String LOGO = "logo";
	public static final String BANNER = "banner";
	public static final String ID = "id";
	public static final String FACEBOOK_LINK = "facebookLink";
	public static final String PHONE1 = "phone1";

}

