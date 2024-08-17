package com.java8Demos;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("Sreekanth","Ramlal","Raju","Nani");
		
		//print the list of values using lambda expression
		l.forEach(
				(x)->System.out.println("List of values : "+x)
				);
		System.out.println("=================================");
		//print the list of values using static Method reference
		l.forEach(System.out::println);
	}

}
