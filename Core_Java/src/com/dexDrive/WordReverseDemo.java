package com.dexDrive;


public class WordReverseDemo {
	
	public static String reverseWord(String str){  
	    String words[]=str.split(" "); //splits the string based on whitespace
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
 public static void main(String[] args) {
	System.out.println(WordReverseDemo.reverseWord("Welcome To Dextris"));
  }
}

