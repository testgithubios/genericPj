package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private int categoryType;

	@Column(name = "parentid")
	private long ParentId;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
