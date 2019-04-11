package com.product.prj.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "products")
public class Products implements Serializable {

	private static final long serialVersionUID = 287082644709185653L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categories_id")
	private Categories categories;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suppliers_id")
	private Suppliers suplier;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "available_size")
	private String availableSize;
	
	@Column(name = "discount")
	private float discount;
	
	@Column(name = "unit_in_stock")
	private int unitInstock;
	
	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	@Column(name = "status")
	private boolean status = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Suppliers getSuplier() {
		return suplier;
	}

	public void setSuplier(Suppliers suplier) {
		this.suplier = suplier;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(String availableSize) {
		this.availableSize = availableSize;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getUnitInstock() {
		return unitInstock;
	}

	public void setUnitInstock(int unitInstock) {
		this.unitInstock = unitInstock;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
