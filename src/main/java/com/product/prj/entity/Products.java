package com.product.prj.entity;

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
public class Products {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "product_id")
	private long id;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categories_id")
	private Categories categories;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suppliers_id")
	private Suppliers suplier;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "weight")
	private float weight;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "available_size")
	private String availableSize;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "available_color")
	private String availableColor;
	
	@Column(name = "discount")
	private float discount;
	
	@Column(name = "unit_in_stock")
	private int unitInstock;
	
	@Column(name = "short_desc", length = 1000)
	private String shortDesc;
	
	@Column(name = "cart_desc", length = 1000)
	private String cartDesc;
	
	@Column(name = "long_desc", columnDefinition = "TEXT")
	private String longDesc;
	
	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	@Column(name = "status")
	private boolean status = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
