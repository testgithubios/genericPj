package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company implements Serializable {
	
	private static final long serialVersionUID = 8015718999076576580L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	
}
