package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 3, 5), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8), Arrays.asList(9, 10));

		// ctrl+1 to return the return type
		//ctrl+shift+f ->for correct alignment
		List<Integer> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect);

		List<List<Integer>> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println("==================================================================");

		// Example list of integers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		        
		// 1. Stream and map example: Print squares of even numbers
		numbers.stream().filter(n -> n % 2 == 0) // Filter even numbers
				.map(n -> n * n) // Map to their squares
				.forEach(System.out::println); // Print each squared number

		System.out.println("---------");

		// 2. Stream and reduce example: Calculate sum of all numbers
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum of all numbers: " + sum);

		System.out.println("---------");

		// 3. Stream and collect example: Create a list of squares of all numbers
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("List of squares: " + squares);
	}

}
