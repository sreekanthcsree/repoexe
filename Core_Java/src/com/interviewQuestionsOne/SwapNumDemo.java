package com.interviewQuestionsOne;

public class SwapNumDemo {
	
	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		
		System.out.println("Before swaping, a = "+a+", b = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping, a = "+a+", b = "+b);
		
	}

}
