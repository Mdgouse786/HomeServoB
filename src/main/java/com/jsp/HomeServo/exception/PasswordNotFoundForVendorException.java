package com.jsp.HomeServo.exception;

import lombok.Data;


public class PasswordNotFoundForVendorException extends RuntimeException {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PasswordNotFoundForVendorException(String message) {
		super();
		this.message = message;
	}
	
	
}
