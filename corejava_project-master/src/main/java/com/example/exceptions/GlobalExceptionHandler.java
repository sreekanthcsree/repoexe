package com.example.exceptions;


public class GlobalExceptionHandler {
    
	public String handleResourceNotFoundException(ResourceNotFoundException ex) {
		 return ex.getMessage();
	}
}
