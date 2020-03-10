package com.employee.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.ErrorResponse;
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	public ResponseEntity<ErrorResponse> handleException(EmployeeNotFoundException empnf){
		
		
		ErrorResponse res =new ErrorResponse();
		
		res.setStatuscode("server error ");
		
	   res.setSatusMessage(empnf.getMessage());
		
		return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
		
	}
	
	
	

}
