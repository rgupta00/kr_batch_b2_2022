package com.empapp.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 4483080593151332060L;
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
