package com.operators;

public class VariablesExOne {
	
	public static void main(String[] args) {
		System.out.println(VariablesEx.a=40);
		
		String str ="Sreekanth";
		String str2 ="";
		for(int i=str.length()-1; i>=0; i-- ) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		// 9 times
		
		
		char[] charArray = str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		for (char c : charArray) {
			System.out.print(c);
		}
	}

}
