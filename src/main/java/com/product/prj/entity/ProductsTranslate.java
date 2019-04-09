package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "products_translate")
@IdClass(ProductsTranslate.class)
public class ProductsTranslate implements Serializable {

	private static final long serialVersionUID = 5985494587336845243L;
	
	@Id
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "products_no_translate_id", referencedColumnName = "product_id")
	private Products products;
	
	@Id
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "languages_id", referencedColumnName = "languages_id")
	private Languages languages;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "weight")
	private float weight;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "available_color")
	private String availableColor;
	
	@Column(name = "short_desc", length = 1000)
	private String shortDesc;
	
	@Column(name = "cart_desc", length = 1000)
	private String cartDesc;
	
	@Column(name = "long_desc")
	private String longDesc;

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAvailableColor() {
		return availableColor;
	}

	public void setAvailableColor(String availableColor) {
		this.availableColor = availableColor;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getCartDesc() {
		return cartDesc;
	}

	public void setCartDesc(String cartDesc) {
		this.cartDesc = cartDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	
}
