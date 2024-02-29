package com.stringsEx;

public class StringEachWordRev {
	
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
	System.out.println(StringEachWordRev.reverseWord("Hai Hello Welcome to java"));
	System.out.println(StringEachWordRev.reverseWord("Sri Venkateswara Swamy"));
	System.out.println(StringEachWordRev.reverseWord("ECNALUBMA"));
  }
}