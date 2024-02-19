package com.stringsEx;

public class StringCountEx {
	
	public static void main(String[] args) {
		
		String s = "sudhakar";
		int count = 0;
		
		//Count each character except space 
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') 
				count++;
		}
				System.out.println("Total number of characters in a string : "+count);	
	}
}