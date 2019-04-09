package com.product.prj.dto;

import com.product.prj.entity.Categories;
import com.product.prj.entity.CategoriesTranslate;

public class CategoriesDTO extends BaseDTO{
	
	private long categoriesId;
	
	private int categoryType;
	
	private long ParentId;
	
	private String name;

	public long getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(long categoriesId) {
		this.categoriesId = categoriesId;
	}

	public int getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}

	public long getParentId() {
		return ParentId;
	}

	public void setParentId(long parentId) {
		ParentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
