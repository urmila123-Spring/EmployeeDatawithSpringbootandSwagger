package com.employee.exceptionHandler;

public class EmployeeNotFoundException  extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	
	public  EmployeeNotFoundException(String str) {
		
		super(str);
		
	}
	
	
	

}
