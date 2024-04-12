package com.stringsEx;

public class SreeCountChar {
	
	public static void main(String[] args) {
		
		String str = "Sreekanth";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
			System.out.println(count);
		}
	}

}
