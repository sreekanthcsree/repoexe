package com.stringsEx;

public class FindLengthDemo {
	
	public static void main(String[] args) {
		
		String str = "Sreekanth Sree";
		//System.out.println(str.length());
		int i =str.length();
		System.out.println("Length of the string : "+i);
		
		System.out.println("=================================");
		
		int cont = 0;
		for(int j=0;j<str.length();j++) {
			// Increment the length for each character
			cont++;
		}
		System.out.println("Length of the string using for loop : "+cont);
	}

}
