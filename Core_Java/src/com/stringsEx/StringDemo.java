package com.stringsEx;

public class StringDemo {
	
	public static void main(String[] args) {
		String s="java";
		String s1="java";
		String s2= new String("java");
		String s3= new String("java");
				
		System.out.println(s==s1);
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println("========================================");
		
		
		String s4="java";
		String s5="java";
		String s6= new String("java");
		String s7= new String("java");
		
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s6.equals(s7));
	}

}
