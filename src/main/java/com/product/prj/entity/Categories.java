package com.product.prj.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories implements Serializable {

	private static final long serialVersionUID = -1633816374375549622L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categories_id")
	private Long id;

	@Column(name = "type_category")
	private Integer categoryType;

	@Column(name = "parentid")
	private Long ParentId;

	@OneToMany(mappedBy = "categories", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CategoriesTranslate> categoriesTranslates = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	public Long getParentId() {
		return ParentId;
	}

	public void setParentId(Long parentId) {
		ParentId = parentId;
	}

//	public List<CategoriesTranslate> getCategoriesTranslates() {
//		return categoriesTranslates;
//	}
//
//	public void setCategoriesTranslates(List<CategoriesTranslate> categoriesTranslates) {
//		this.categoriesTranslates = categoriesTranslates;
//	}

}
