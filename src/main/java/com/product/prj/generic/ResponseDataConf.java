package com.product.prj.generic;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Locale;
import java.util.ResourceBundle;
import com.product.prj.dto.ResponseDTO;

public class ResponseDataConf<T> {
	
	public ResponseEntity<ResponseDTO<T>> getResponseEntity(HttpStatus httpStatus, String languageShortName, String keyMessage, T data){
		
		HttpHeaders httpHeaders = new HttpHeaders();
		var locale = new Locale(languageShortName);
		var messages = ResourceBundle.getBundle("messages", locale).getString(keyMessage);
		
		return new ResponseEntity<ResponseDTO<T>>(
				new ResponseDTO<T>(HttpStatus.OK, messages, data), httpHeaders, HttpStatus.OK);
	}
}
