package com.varxyz.jv252.exception;

@SuppressWarnings("serial")
public class DuplicatedEntityException extends RuntimeException{
	public DuplicatedEntityException(String msg) {
		super(msg);
	}
}
