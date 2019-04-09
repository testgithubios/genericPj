package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_img")
public class ProductImg implements Serializable {

	private static final long serialVersionUID = 1388070485170661016L;

	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "product_img_id")
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private Products products;
	
	@Column(name = "product_img")
	private String productImg;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
}
