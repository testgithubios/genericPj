package com.product.prj.entity;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Products.class)
public abstract class Products_ {

	public static volatile SingularAttribute<Products, Date> updateDate;
	public static volatile SingularAttribute<Products, String> size;
	public static volatile SingularAttribute<Products, String> name;
	public static volatile SingularAttribute<Products, Suppliers> suplier;
	public static volatile SingularAttribute<Products, Integer> unitInstock;
	public static volatile SingularAttribute<Products, Float> discount;
	public static volatile SingularAttribute<Products, Long> id;
	public static volatile SingularAttribute<Products, Categories> categories;
	public static volatile SingularAttribute<Products, String> sku;
	public static volatile SingularAttribute<Products, String> availableSize;
	public static volatile SingularAttribute<Products, Boolean> status;

	public static final String UPDATE_DATE = "updateDate";
	public static final String SIZE = "size";
	public static final String NAME = "name";
	public static final String SUPLIER = "suplier";
	public static final String UNIT_INSTOCK = "unitInstock";
	public static final String DISCOUNT = "discount";
	public static final String ID = "id";
	public static final String CATEGORIES = "categories";
	public static final String SKU = "sku";
	public static final String AVAILABLE_SIZE = "availableSize";
	public static final String STATUS = "status";

}

