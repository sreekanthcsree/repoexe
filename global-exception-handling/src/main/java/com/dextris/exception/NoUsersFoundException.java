package com.dextris.exception;

public class NoUsersFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NoUsersFoundException(String msg) {
		super(msg);
	}
}
