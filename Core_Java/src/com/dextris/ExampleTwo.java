package com.dextris;

public class ExampleTwo implements ExampleOne{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1() method...!");
	}

	public static void main(String[] args) {
		ExampleTwo two = new ExampleTwo();
		two.m1();
		two.m3("Sreekanth", " Kishore");
	}
}
