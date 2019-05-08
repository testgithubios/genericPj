package com.product.prj.dto;

import java.util.Date;

public class CategoriesDTO extends BaseDTO{
	
	private Long categoriesId;
	
	private Integer categoryType;
	
	private Long parentId;
	
	private String name;
	
	private Long languageId;
	
	private Date updateDate;
	
	public CategoriesDTO(Long categoriesId, Integer categoryType, Long parentId, String name) {
		this.categoriesId = categoriesId;
		this.categoryType = categoryType;
		this.parentId = parentId;
		this.name = name;
				
	}
	
	public CategoriesDTO(Long categoriesId, Integer categoryType, Long parentId, String name, Long languageId, Date updateDate) {
		this.categoriesId = categoriesId;
		this.categoryType = categoryType;
		this.parentId = parentId;
		this.name = name;
		this.setUpdateDate(updateDate);
		this.setLanguageId(languageId);
	}
	
	public CategoriesDTO() {
	}
	
	public Long getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(Long categoriesId) {
		this.categoriesId = categoriesId;
	}

	public Integer getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
