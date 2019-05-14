package com.product.prj.generic;

public class GenericMethod {

	public static String getConditionFromConditionObj(SearchObj searchObj) {
		String result = null;
		if(		Constants.EQUAL.equals(searchObj.getOperator()) ||
				Constants.LAGRER.equals(searchObj.getOperator()) ||
				Constants.SMALLER.equals(searchObj.getOperator())) {
			result = searchObj.getFieldName()+" "+searchObj.getOperator()+" "+searchObj.getFieldValue();
		}else if(Constants.LIKE.equals(searchObj.getOperator()) ) {
			result = searchObj.getFieldName()+" "+searchObj.getOperator()+" '%"+searchObj.getFieldValue()+"%'";
		}
		
		return result;
	}
}
