package com.product.prj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers_translate")
@IdClass(SuppliersTranslate.class)
public class SuppliersTranslate implements Serializable {

	private static final long serialVersionUID = -3794160342537783942L;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "suppliers_no_translate_id", referencedColumnName = "suppliers_id")
	private Categories categories;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "language_id", referencedColumnName = "languages_id")
	private Languages languages;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "contactName")
	private String contactName;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "note")
	private String note;
}
