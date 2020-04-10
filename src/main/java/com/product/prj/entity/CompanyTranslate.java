package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.product.prj.entity.composedkey.CompanyTranslateKey;

@Entity
@Table(name = "company_translate")
@IdClass(CompanyTranslateKey.class)
public class CompanyTranslate implements Serializable {

	private static final long serialVersionUID = -5794940774036967682L;
	
    @Id
    @Column(name = "language_short_name")
    private String languageShortName;
    
	@Id
	@Column(name = "company_id")
	private Long companyId;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "company_id", insertable = false, updatable = false)
	private Company company;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "address")
	private String address;

	public CompanyTranslate() {
		
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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

	public String getLanguageShortName() {
		return languageShortName;
	}

	public void setLanguageShortName(String languageShortName) {
		this.languageShortName = languageShortName;
	}
	
}
