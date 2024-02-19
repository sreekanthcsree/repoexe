package com.exceptions;

public class Sree2 {
	public static void main(String[] args) {
		int age=13;
		if(age<18) {
			throw new ArithmeticException("he is not eligible for vote");
		}else {
			System.out.println("he is eligible for vote");
		}
	}
}
