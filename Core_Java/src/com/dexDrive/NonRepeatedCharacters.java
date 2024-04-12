package com.dexDrive;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacters {
	
	
	public static void main(String[] args) {
        String str = "Welcome To Java";

        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);

        if (firstNonRepeatedChar != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated characters found.");
        }
    }
	
	public static char findFirstNonRepeatedChar(String str) {
        // Removing non-alphabetic characters and converting to lowercase
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Counting the frequency of each character
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Finding the first non-repeated character
        for (char c : str.toCharArray()) {
            if (charFrequencyMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeated character is found, return '\0'
        return '\0';
    }
}


	   

	    