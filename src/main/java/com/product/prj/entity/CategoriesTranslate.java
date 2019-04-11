package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.product.prj.entity.composedkey.CategoriesTranslateKey;

@Entity
@Table(name = "categories_translate")
@IdClass(CategoriesTranslateKey.class)
public class CategoriesTranslate implements Serializable {

	private static final long serialVersionUID = -1190399174418272028L;
	
	
	@Id
	@Column(name = "categories_id")
	private Long categoriesId;
	
	@Id
	@Column(name = "languages_id")
	private Long languagesId;
	
	
	@ManyToOne
	@JoinColumn(name = "categories_id", insertable = false, updatable = false)
	private Categories categories;
	
	
	@ManyToOne
	@JoinColumn(name = "languages_id", insertable = false, updatable = false)
	private CusLanguages languages;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
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

	public Long getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(Long categoriesId) {
		this.categoriesId = categoriesId;
	}

	public Long getLanguagesId() {
		return languagesId;
	}

	public void setLanguagesId(Long languagesId) {
		this.languagesId = languagesId;
	}
}
