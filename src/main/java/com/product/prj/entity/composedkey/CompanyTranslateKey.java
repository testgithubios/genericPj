package com.product.prj.entity.composedkey;

import java.io.Serializable;

public class CompanyTranslateKey  implements Serializable{

	private static final long serialVersionUID = -8083639715333557948L;
	
	private Long languagesId;
	private Long companyId;
	public Long getLanguagesId() {
		return languagesId;
	}
	public void setLanguagesId(Long languagesId) {
		this.languagesId = languagesId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	
}
