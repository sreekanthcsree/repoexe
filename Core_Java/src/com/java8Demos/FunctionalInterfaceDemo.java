package com.java8Demos;

@FunctionalInterface
interface Sayable{
	public void max(String message);//abstract method
	@Override
	int hashCode();
	@Override
	String toString();
	@Override
	boolean equals(Object obj);
}

public class FunctionalInterfaceDemo implements  Sayable {
	
	@Override
	public void max(String message) {
		// TODO Auto-generated method stub
	 System.out.println("hello welcome to...!"+message);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo fi = new FunctionalInterfaceDemo();
		fi.max(" Banaglore");
	}

}
