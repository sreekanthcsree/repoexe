package com.interviewQuestions;

class SpecialCharPrintOne{
	
	public static void main(String[] args) {
		
       String str = "Java@!&||*%welcom@e";
		
		//Each character in the string through loop
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			//check if the character is special character
			if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
				System.out.print(ch+" ");
			}
		}
	}
}
public class SpecialCharPrint {
	
	public static void main(String[] args) {
		
		String str = "Java@!&||*%welcom@e";
		
		//Each character in the string through loop
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			//check if the character is without special character or not
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				System.out.print(ch+" ");
			}
		}
	}

}
