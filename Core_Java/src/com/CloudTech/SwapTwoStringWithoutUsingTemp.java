package com.CloudTech;

public class SwapTwoStringWithoutUsingTemp {

	public static void main(String[] args) {
		String str1="Cloud";
		String str2="Tech";
		
	    System.out.println("First String before swapping: "+str1);
	    System.out.println("Second String before swapping: "+str2);
	    System.out.println("----------------------------------------->");
	    
	   str1= str1+str2;
	   str2=str1.substring(0, (str1.length()-str2.length()));
	   str1=str1.substring(str2.length());
	   
	   System.out.println("First String after swapping: "+str1);
	   System.out.println("Second String after swapping: "+str2);	   
	}
}
