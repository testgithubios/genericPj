package com.product.prj.entity.composedkey;

import java.io.Serializable;

public class CategoriesTranslateKey implements Serializable{

	private static final long serialVersionUID = 2722166719876159323L;
	private long categoriesId;
	private long languagesId;
	
	public long getCategories() {
		return categoriesId;
	}
	public void setCategories(long categories) {
		this.categoriesId = categories;
	}
	public long getLanguages() {
		return languagesId;
	}
	public void setLanguages(long languages) {
		this.languagesId = languages;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
