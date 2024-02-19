package com.mamatha;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str = "java";
		String str1 = "java";
		String str7 = "Java";
		System.out.println("str7 hashcode : "+str7.hashCode());
		String str2 = "python";
		String str8 = "Python";
	
		
		String str3 = new String("java");
		String str4 = new String("python");
		String str5 = new String("Java");
		String str6 = new String("java");
		
		//== : 
		
		System.out.println(str==str1);//true
		System.out.println(str==str6);//false
		System.out.println(str3==str6);//false
		System.out.println(str2==str4);//false
		System.out.println(str2==str8);//true
		
		System.out.println(str.equals(str1));//true
		System.out.println(str2.equals(str8));//false
		System.out.println(str3.equals(str6));//true
		
	}

}
