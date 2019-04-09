package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Languages implements Serializable {

	private static final long serialVersionUID = -7729806871572499336L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "languages_id")
	private long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "short_name")
	private String shortName;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}	
}
