package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProductsTranslate.class)
public abstract class ProductsTranslate_ {

	public static volatile SingularAttribute<ProductsTranslate, Languages> languages;
	public static volatile SingularAttribute<ProductsTranslate, String> color;
	public static volatile SingularAttribute<ProductsTranslate, Float> price;
	public static volatile SingularAttribute<ProductsTranslate, Float> weight;
	public static volatile SingularAttribute<ProductsTranslate, String> shortDesc;
	public static volatile SingularAttribute<ProductsTranslate, String> availableColor;
	public static volatile SingularAttribute<ProductsTranslate, String> cartDesc;
	public static volatile SingularAttribute<ProductsTranslate, String> longDesc;
	public static volatile SingularAttribute<ProductsTranslate, Products> products;

	public static final String LANGUAGES = "languages";
	public static final String COLOR = "color";
	public static final String PRICE = "price";
	public static final String WEIGHT = "weight";
	public static final String SHORT_DESC = "shortDesc";
	public static final String AVAILABLE_COLOR = "availableColor";
	public static final String CART_DESC = "cartDesc";
	public static final String LONG_DESC = "longDesc";
	public static final String PRODUCTS = "products";

}

