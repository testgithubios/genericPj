package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cus_languages")
public class CusLanguages implements Serializable {

	private static final long serialVersionUID = -234324922977861206L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "languages_id")
	private Long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "short_name")
	private String shortName;
	
	@Column(name = "is_default")
	private Boolean isDefault;
	
	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}	
}
