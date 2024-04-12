package com.dexDrive;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersDemo {
	
	public static void main(String[] args) {
        String str = "Welcome To Bangalore";
        
        // Removing spaces and converting to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Counting the occurrences of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // Printing the character count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}

