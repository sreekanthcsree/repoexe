package com.dextris;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountExample {
	
	private static Map<Character, Long> countCharacters(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
	
	public static void main(String[] args) {
		
        String inputString = "hello world";

        // Count characters using Java 8 streams
        Map<Character, Long> charCountMap = countCharacters(inputString);

        // Print the character counts
        charCountMap.forEach((character, count) ->
                System.out.println("Character: " + character + ", Count: " + count));
    }

}
