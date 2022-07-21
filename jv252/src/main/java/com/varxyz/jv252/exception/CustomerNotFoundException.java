package com.varxyz.jv252.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends EntityNotFoundException{
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
