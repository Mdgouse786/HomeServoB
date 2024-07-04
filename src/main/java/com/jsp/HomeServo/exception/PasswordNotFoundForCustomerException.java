package com.jsp.HomeServo.exception;

import lombok.Data;


public class PasswordNotFoundForCustomerException extends RuntimeException {
	private String message="incorrect password please check the password again";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PasswordNotFoundForCustomerException() {
		super();
	}

	public PasswordNotFoundForCustomerException(String message) {
		super();
		this.message = message;
	}
	
	
}
