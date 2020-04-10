package com.product.prj.entity.composedkey;

import java.io.Serializable;

public class CompanyTranslateKey  implements Serializable{

	private static final long serialVersionUID = -8083639715333557948L;
	
	private String languageShortName;
	private Long companyId;
	
	
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getLanguageShortName() {
		return languageShortName;
	}
	public void setLanguageShortName(String languageShortName) {
		this.languageShortName = languageShortName;
	}
	
	
}
