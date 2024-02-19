package com.stringsEx;

public class StringEx2 {
	public static void main(String[] args) {
		
		String s="Sreekanth";
		char ch=s.charAt(4);//it will returns particular character 
		System.out.println("particular character: "+ch);
		System.out.println("=========================");
		
		String str="Welcome to Java";
		int length=str.length();
		System.out.println("first char:"+str.charAt(0));
		System.out.println("Last Char:"+str.charAt(length-1));
		System.out.println("------------------------------------");
		
		String str1="Hai Hello Welocome to Java Classes";
		for(int i=0;i<str1.length()-1;i++) {
			if(i%2!=0) {
				System.out.println("Char : "+i+" Place : "+str1.charAt(i));
			}
		}
	}
}
