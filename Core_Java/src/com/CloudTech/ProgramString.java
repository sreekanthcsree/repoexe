package com.CloudTech;

public class ProgramString {
	public static void main(String[] args) {
		String str="Sreekanth!@";
		int count=0;
		String specialCharacterRemoved = "";
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(i) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
			}else {
				specialCharacterRemoved=specialCharacterRemoved+str.charAt(i);
			}
		}
		if(count==0) {
			System.out.println("there are no special character in string");
		}else {
			System.out.println("special character found :"+count);
		}
		System.out.println("special characters removed:"+specialCharacterRemoved);
	}

}
