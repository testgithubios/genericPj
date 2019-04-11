package com.product.prj.dto;

public class CategoriesDTO extends BaseDTO{
	
	private Long categoriesId;
	
	private Integer categoryType;
	
	private Long parentId;
	
	private String name;

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

	public long getParentId() {
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
}
