package com.dextris;

public class TestMain {
	
	public static void m(String s) {
		System.out.println("String arg");
	}
	
	public static void m1(Object s) {
		System.out.println("Object arg");
	}
	
	public static void m1(StringBuffer s) {
		System.out.println("StringBuffer arg");
	}
	
	public static void main(String[] args) {
		m1(null);
	}
}
