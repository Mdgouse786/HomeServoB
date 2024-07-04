package com.jsp.HomeServo.exception;

import lombok.Data;


public class NoSuchElementFoundByCustomerException extends RuntimeException {
 private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public NoSuchElementFoundByCustomerException(String message) {
	super();
	this.message = message;
}
 
 
}
