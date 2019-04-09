package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "categories_translate")
@IdClass(CategoriesTranslate.class)
public class CategoriesTranslate implements Serializable {

	private static final long serialVersionUID = -1190399174418272028L;
	
	@Id
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "categories_no_translate_id", referencedColumnName = "categories_id")
	private Categories categories;
	
	@Id
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "language_id", referencedColumnName = "languages_id")
	private Languages languages;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
