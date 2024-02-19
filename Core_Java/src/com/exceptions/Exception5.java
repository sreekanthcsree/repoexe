package com.exceptions;

public class Exception5 {
	   public static void main(String[] args) {  
	        try {
	        int data=50/0; //may throw exception 
	        //handling the Exception
	        }catch(Exception e){   
	                  // displaying the custom message  
	            System.out.println("Can't divided by zero");  
	        }  
	    }  
}
