package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CompanyImg.class)
public abstract class CompanyImg_ {

	public static volatile SingularAttribute<CompanyImg, String> imgName;
	public static volatile SingularAttribute<CompanyImg, Company> company;
	public static volatile SingularAttribute<CompanyImg, Long> id;
	public static volatile SingularAttribute<CompanyImg, Integer> imgType;

	public static final String IMG_NAME = "imgName";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String IMG_TYPE = "imgType";

}

