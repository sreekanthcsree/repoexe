package com.abhi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 5, 6, 8, 6, 9);

		List<Integer> collect = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		Optional<Integer> findFirst = numbers.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
		System.out.println("Duplicate Elements are: " + collect);
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		} else {
			System.out.println("Either List is empty or unable to fetch second largest");
		}
	}
}
