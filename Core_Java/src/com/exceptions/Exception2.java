package com.exceptions;

public class Exception2 {
	public static void main(String[] args) {
		try {
		String s=null;//Null pointer Exception
		System.out.println(s.length());
	}catch(NullPointerException e) {
		System.out.println(e);
		System.out.println("Hello");
	}
  }
}