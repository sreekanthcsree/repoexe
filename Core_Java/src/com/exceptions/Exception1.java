package com.exceptions;

public class Exception1 {
	public static void main(String[] args) {
		try {
		int x=100/0;//Arithmetic Exception
		System.out.println(x);
	}catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("hello world");
	}
		finally {
			System.out.println("Hi i am finally block...!");
		}
  }
}
