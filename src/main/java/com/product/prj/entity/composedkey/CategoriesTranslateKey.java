package com.product.prj.entity.composedkey;

import java.io.Serializable;

public class CategoriesTranslateKey implements Serializable{

	private static final long serialVersionUID = 2722166719876159323L;
	private Long categoriesId;
	private Long languagesId;
	
	public Long getCategories() {
		return categoriesId;
	}
	public void setCategories(Long categories) {
		this.categoriesId = categories;
	}
	public Long getLanguages() {
		return languagesId;
	}
	public void setLanguages(Long languages) {
		this.languagesId = languages;
	}
	public static Long getSerialversionuid() {
		return serialVersionUID;
	}
}
