package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@StaticMetamodel(ProductImg.class)
public abstract class ProductImg_ {

	public static volatile SingularAttribute<ProductImg, String> productImg;
	public static volatile SingularAttribute<ProductImg, Long> id;
	public static volatile SingularAttribute<ProductImg, Products> products;

	public static final String PRODUCT_IMG = "productImg";
	public static final String ID = "id";
	public static final String PRODUCTS = "products";

}

