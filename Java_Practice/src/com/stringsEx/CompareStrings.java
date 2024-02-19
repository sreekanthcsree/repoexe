package com.stringsEx;

public class CompareStrings {
	
	public static void main(String[] args) {
		
		String s = "java";
		char[] ch = {'s','t','r','i','n','g','s'};
		String s1 = new String(ch);
		String s2 = new String("Java");
		String s3 = "Strings";
		String s4 = new String("java");
		String s5 = "java";
		
		//.equals() : content comparison
		System.out.println(s.equals(s2));//false
		System.out.println(s.equals(s4));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s2.equals(s3));//false
		System.out.println("---------------------------");
		
		
		//double equals(==) method : reference or address comparison
		System.out.println(s1==s3);//false
		System.out.println(s2==s4);//false
		System.out.println(s==s5);//true
		
		
		//compareTo() : it returns int values
		
		System.out.println(s.compareTo(s5));
		System.out.println(s.compareTo(s4));
	}

}
