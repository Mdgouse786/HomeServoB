package com.jsp.HomeServo.exception;

import lombok.Data;


public class EmailNotFoundForVendorException extends RuntimeException {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmailNotFoundForVendorException(String message) {
		super();
		this.message = message;
	}
	
}
