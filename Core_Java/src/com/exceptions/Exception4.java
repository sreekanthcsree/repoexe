package com.exceptions;

public class Exception4 {
	public static void main(String[] args) {
		try {
			int sree[]=new int[4];
			sree[6]=10;
			System.out.println(sree);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Hello Sree");
	}
}
