package com.capgemini.pecunia.exception;

public class TransactionDoesNotExist extends Exception {

	private static final long serialVersionUID = 1L;

	String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
