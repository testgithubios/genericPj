package com.product.prj.dto;

import com.product.prj.entity.CusLanguages;

public class CompanyDTO {
	
	private Long id;
	
	private String name;
	
	private String phone1;
	
	private String phone2;
	
	private String facebookLink;
	
	private String youtupeLink;
	
	private String instagramLink;
	
	private String logo;
	
	private String banner;
	
	private String address;
	
	private Long languageId;
	
	private CusLanguages language;
	
	private Boolean isDefault;
	
	public CompanyDTO(Long id, String name, String phone1, String phone2, String facebookLink, 
			String youtupeLink, String instagramLink, String logo, String banner, String address, Long languageId, CusLanguages language, Boolean isDefault) {
		
		this.id = id;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.facebookLink = facebookLink;
		this.youtupeLink = youtupeLink;
		this.instagramLink = instagramLink;
		this.logo = logo;
		this.banner = banner;
		this.address = address;
		this.languageId = languageId;
		this.language = language;
		this.isDefault = isDefault;
	}
	
	public CompanyDTO(Long id, String name, String phone1, String phone2, String facebookLink, 
			String youtupeLink, String instagramLink, String logo, String banner, String address, Long languageId) {
		
		this.id = id;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.facebookLink = facebookLink;
		this.youtupeLink = youtupeLink;
		this.instagramLink = instagramLink;
		this.logo = logo;
		this.banner = banner;
		this.address = address;
		this.languageId = languageId;
	}
	
	public CompanyDTO() {}
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public CusLanguages getLanguage() {
		return language;
	}

	public void setLanguage(CusLanguages language) {
		this.language = language;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
}
