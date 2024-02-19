package com.abhi;

public class superKeyword3 extends superKeyword2 {
	
	public void m1() {
		super.m1();
		System.out.println("child method");
	}
	public static void main(String[] args) {
		superKeyword3 ex=new superKeyword3();
		ex.m1();
		
	}
}
