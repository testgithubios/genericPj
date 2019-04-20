package com.product.prj.dto;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class ResponseDTO<T> implements Serializable {

	private static final long serialVersionUID = -1416526267982662218L;

	private HttpStatus httpStatus;
	private T data;
	private String message;

	public ResponseDTO() {
	}

	public ResponseDTO(HttpStatus httpStatus, String message) {
		this(httpStatus, message, null);
	}

	public ResponseDTO(HttpStatus httpStatus, String message, T data) {
		this.data = data;
		this.message = message;
		this.httpStatus = httpStatus;
	}
	
	public ResponseDTO(HttpStatus httpStatus,  T data) {
		this.data = data;
		this.httpStatus = httpStatus;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
