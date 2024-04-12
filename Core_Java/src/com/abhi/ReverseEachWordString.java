package com.abhi;

public class ReverseEachWordString {
	
	public static String reverseString(String str) {
		
		String[] words = str.split(" ");
		String reverseString = "";
		for(String i : words) {
			StringBuffer sb = new StringBuffer(i);
			sb.reverse();
			reverseString+=sb.toString()+" ";
		}
		return reverseString.trim();
	}
	public static void main(String[] args) {
		System.out.println("Using without object creation : "+reverseString("Hello Sreekanth welcome to Bangalore"));//or
		System.out.println("=====================================================================");
		System.out.println("Using class name : "+ReverseEachWordString.reverseString("Sri Venkateswara swammy"));//or
		ReverseEachWordString eachWordString= new ReverseEachWordString();
		System.out.println("==========================================================================");
		System.out.println("Using object creation : "+eachWordString.reverseString("Sri Anjaneya Swammy"));
	}

}
