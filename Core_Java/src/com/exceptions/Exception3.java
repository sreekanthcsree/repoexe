package com.exceptions;

public class Exception3 {
	public static void main(String[] args) {
		try {
		String s="Hai";
	    int i=Integer.parseInt(s);//NumberFormatException
	}catch(NumberFormatException e) {
		System.out.println("Hai Hello");	
	}
		System.out.println("Welcome");
  }
}