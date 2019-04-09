package com.product.prj.dto;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDTO {
	
	private long languagesId;

	public long getLanguagesId() {
		return languagesId;
	}

	public void setLanguagesId(long languagesId) {
		this.languagesId = languagesId;
	}
}
