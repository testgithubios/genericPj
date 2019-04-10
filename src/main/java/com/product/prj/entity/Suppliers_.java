package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Suppliers.class)
public abstract class Suppliers_ {

	public static volatile SingularAttribute<Suppliers, String> phone;
	public static volatile SingularAttribute<Suppliers, String> postalCode;
	public static volatile SingularAttribute<Suppliers, Long> id;
	public static volatile SingularAttribute<Suppliers, String> fax;
	public static volatile SingularAttribute<Suppliers, String> email;
	public static volatile SingularAttribute<Suppliers, String> url;

	public static final String PHONE = "phone";
	public static final String POSTAL_CODE = "postalCode";
	public static final String ID = "id";
	public static final String FAX = "fax";
	public static final String EMAIL = "email";
	public static final String URL = "url";

}

