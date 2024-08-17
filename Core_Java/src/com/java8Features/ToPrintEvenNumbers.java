package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToPrintEvenNumbers {
	
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,2,3,4,5,6,10,46);
		//to print the even numbers
		List<Integer> evenNumbers = input.stream()
				                         .filter(num->num%2==0)
				                         .collect(Collectors.toList());
		System.out.println("Even numbers : "+evenNumbers);
		
		System.out.println("=============sorted values====================");
		List<Integer> l1= Arrays.asList(5,6,2,4,1,10,7,21,17,11);
	    List<Integer> sortNumbers = l1.stream()
	    		                      .sorted()
	    		                      .collect(Collectors.toList());
	    System.out.println(sortNumbers);
	    
	    System.out.println("=============uppperCaseVersions====================");
	    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
	    List<String> uppercasedWords = words.stream()
	     .map(String::toUpperCase)
	     .collect(Collectors.toList());
	    System.out.println(uppercasedWords);
	}
	

}
