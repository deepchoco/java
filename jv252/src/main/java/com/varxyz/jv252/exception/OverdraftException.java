package com.varxyz.jv252.exception;

public class OverdraftException extends RuntimeException {
	public OverdraftException() {
		
	}
	
	public OverdraftException(String msg, double balance, double overdraftNeeded) {
		super(msg);
	}
}
