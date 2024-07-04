package com.jsp.HomeServo.exception;

import lombok.Data;


public class NoSuchElementFoundFOrAddressException extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NoSuchElementFoundFOrAddressException(String message) {
		super();
		this.message = message;
	}
	
}
