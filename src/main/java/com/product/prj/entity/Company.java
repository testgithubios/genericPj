package com.product.prj.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "company")
public class Company implements Serializable {

	private static final long serialVersionUID = 8015718999076576580L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private Long id;

	@Column(name = "phone1")
	private String phone1;

	@Column(name = "phone2")
	private String phone2;

	@Column(name = "facebookLink")
	private String facebookLink;

	@Column(name = "youtupeLink")
	private String youtupeLink;

	@Column(name = "instagramLink")
	private String instagramLink;

	@Column(name = "logo")
	private String logo;

	@Column(name = "banner")
	private String banner;

	@Column(name = "is_default")
	private Boolean isDefault;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
	@JsonBackReference
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	private Set<CompanyTranslate> companyTranslates = new HashSet<>();

	public Company(Long id, String phone1, String phone2, String facebookLink, String youtupeLink, String instagramLink,
			String logo, String banner, Boolean isDefault) {

		this.id = id;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.facebookLink = facebookLink;
		this.youtupeLink = youtupeLink;
		this.instagramLink = instagramLink;
		this.logo = logo;
		this.banner = banner;
		this.setIsDefault(isDefault);
	}

	public Company() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getYoutupeLink() {
		return youtupeLink;
	}

	public void setYoutupeLink(String youtupeLink) {
		this.youtupeLink = youtupeLink;
	}

	public String getInstagramLink() {
		return instagramLink;
	}

	public void setInstagramLink(String instagramLink) {
		this.instagramLink = instagramLink;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Set<CompanyTranslate> getCompanyTranslates() {
		return companyTranslates;
	}

	public void setCompanyTranslates(Set<CompanyTranslate> companyTranslates) {
		this.companyTranslates = companyTranslates;
	}

}
