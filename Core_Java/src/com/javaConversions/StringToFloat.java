package com.javaConversions;

public class StringToFloat {
	public static void main(String[] args) {
		String s="4678.57";
		Float f=Float.parseFloat(s);
		System.out.println("this is String to Float: "+f);
		System.out.println("------------------------------------->");
		
		Float f1=585329.587f;
		String s1=Float.toString(f1);
		System.out.println("this is Float to String: "+s1);
	}

}
