package com.exceptions;

public class Exception6 {
	public static void main(String[] args) {
		int a=30,b=0,x;
		try {
		    x=a/b;//may thrown Exception
		    //handling Exception
		}catch(Exception e) {
			// resolving the exception in catch block 
			System.out.println(+(a/(b+2)));
			System.out.println("Successfully Executed!");
		}
	}
}
