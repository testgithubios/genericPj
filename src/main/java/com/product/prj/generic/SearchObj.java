package com.product.prj.generic;

public class SearchObj {
	
	private String fieldName;
	
	private String fieldValue;
	
	private String operator;

	public SearchObj() {}
	
	public SearchObj(String fieldName, String fieldValue, String operator) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		this.operator = operator;
	}
	
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
}
