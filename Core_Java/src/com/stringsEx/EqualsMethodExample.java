package com.stringsEx;

public class EqualsMethodExample {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		String s3="Java";
		
		System.out.println(s1.equals(s3));//it returns false ..case sensitive
		System.out.println(s1.equalsIgnoreCase(s3));
		if(s1.equals(s2)) {
			System.out.println("if both the Strings are Equal");
		}else {
			System.out.println("if both the Strings are not Equal");
		}
	}
}
