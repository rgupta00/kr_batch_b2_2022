package com.empapp.exception;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -4249276493175968624L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
