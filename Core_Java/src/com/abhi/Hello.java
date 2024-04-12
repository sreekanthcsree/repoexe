package com.abhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
	    Scanner scanner1= new Scanner(System.in);
		System.out.println("Enter id : ");
		Long id = scanner1.nextLong();
		System.out.println("Id inserted successfully...!");
		System.out.println("Enter password : ");
		String pass = scanner1.next();
		System.out.println("Password inserted successfully...!");
		int key=2;
		switch (key) {
		case 1:
			List<String> list = new ArrayList<>();
			list.add("Hi");
			list.add("Hello");
			list.add("Welcome");
			list.add("to Bangalore");
			System.out.println(list);
			break;

		default:
			break;
		}
		
	 }
}
	