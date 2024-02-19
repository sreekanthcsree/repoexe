package com.stringsEx;

public class StringsEx1 {
	   public static void main(String[] args) {    
	        String s = "C Sreekanth";    
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < s.length(); i++) {    
	            if(s.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);  
	        System.out.println("-------------------------------------------------");
	    }    
}
