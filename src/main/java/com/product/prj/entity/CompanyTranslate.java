package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "company_translate")
@IdClass(CompanyTranslate.class)
public class CompanyTranslate implements Serializable {

	private static final long serialVersionUID = -5794940774036967682L;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "company_no_translate_id", referencedColumnName = "company_id")
	private Company company;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "language_id", referencedColumnName = "languages_id")
	private CusLanguages languages;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "address")
	private String address;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CusLanguages getLanguages() {
		return languages;
	}

	public void setLanguages(CusLanguages languages) {
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
