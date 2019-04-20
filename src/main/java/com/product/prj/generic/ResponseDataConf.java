package com.product.prj.generic;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.product.prj.dto.ResponseDTO;

public class ResponseDataConf<T> {
	
	public ResponseEntity<ResponseDTO<T>> getResponseEntity(HttpStatus httpStatus, T data){
		
		HttpHeaders httpHeaders = new HttpHeaders();
		
		return new ResponseEntity<ResponseDTO<T>>(
				new ResponseDTO<T>(httpStatus, data), httpHeaders, httpStatus);
	}
	
	public ResponseEntity<ResponseDTO<T>> getResponseEntityWithMessage(HttpStatus httpStatus, String message, T data){
		
		HttpHeaders httpHeaders = new HttpHeaders();
		
		return new ResponseEntity<ResponseDTO<T>>(
				new ResponseDTO<T>(httpStatus, message, data), httpHeaders, httpStatus);
	}
}
