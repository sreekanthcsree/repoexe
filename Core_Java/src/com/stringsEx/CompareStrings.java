package com.stringsEx;

public class CompareStrings {
	public static void main(String[] args) {
		String s="hello";
		String s8="Hello";
		char ch[]= {'s','t','r','i','n','g','s'};
		String s1=new String(ch);
		String s2=new String("strings");
		String s3=new String("Hello");
		String s9=new String("hello");
		
		System.out.println(s3.equals(s9));//false
		System.out.println(s.equals(s8));//false
		System.out.println(s.equals(s1));//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s));//false
		System.out.println(s3.equalsIgnoreCase(s));//true
		System.out.println(s3.equals(s));//false
		
	 System.out.println("---------------------------------------------------->");
			   String a1="Sachin";  
			   String a2="Sachin";  //this is == method
			   String a5="sachin";
			   String a3=new String("Sachin");  
			   String a4=new String("Sachin");
			   
			   System.out.println(a1==a5);//false
			   System.out.println(a1==a2);//true (because both refer to same instance)  
			   System.out.println(a1==a3);//false(because a3 refers to instance created in non_pool) 
			   System.out.println(a3==a4);//false
			 }  
	}