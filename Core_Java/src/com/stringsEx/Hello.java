package com.stringsEx;

public class Hello {
	public static void main(String args[]){  
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" 
		System.out.println("----------------------------------------------------------");
		
		
			String a1="hello";  
			String a2="";  
			String a3="mea";  
			System.out.println(a1.compareTo(a2)); //5 
			System.out.println(a2.compareTo(a3));  //-3
		}  
}
