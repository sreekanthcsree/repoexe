package com.javaConversions;

public class StringToLong {
	public static void main(String[] args) {
		String s="57985606796";
		//to convert String to Long
		long l=Long.parseLong(s);
		System.out.println("this is String to Long: "+l);
		System.out.println("--------------------------------->");
		
		//to convert Long to String
		long l1=654320697769l;
		String s1=String.valueOf(l1);
		System.out.println("this is long to String: "+s1);
	}

}
