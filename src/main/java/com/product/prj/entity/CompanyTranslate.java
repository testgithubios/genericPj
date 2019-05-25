package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.product.prj.entity.composedkey.CompanyTranslateKey;

@Entity
@Table(name = "company_translate")
@IdClass(CompanyTranslateKey.class)
public class CompanyTranslate implements Serializable {

	private static final long serialVersionUID = -5794940774036967682L;
	
	@Id
	@Column(name = "company_id")
	private Long companyId;
	
	@Id
	@Column(name = "languages_id")
	private Long languagesId;
	
	
	@ManyToOne
	@JoinColumn(name = "company_id", insertable = false, updatable = false)
	private Company company;
	
	
	@ManyToOne
	@JoinColumn(name = "languages_id", insertable = false, updatable = false)
	private CusLanguages languages;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "address")
	private String address;

	public CompanyTranslate(Long companyId, Long languagesId, Company company, CusLanguages languages, String name,
			String address) {
		this.companyId = companyId;
		this.languagesId = languagesId;
		this.company = company;
		this.languages = languages;
		this.name = name;
		this.address = address;
	}

	public CompanyTranslate() {
		
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getLanguagesId() {
		return languagesId;
	}

	public void setLanguagesId(Long languagesId) {
		this.languagesId = languagesId;
	}
	
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
