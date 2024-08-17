package com.dextris.exception;

public class UserCannotBeCreatedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserCannotBeCreatedException(String string) {
		super(string);
	}
}
