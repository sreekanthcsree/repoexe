package com.dexDrive;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
        String str = "welcome to java and welcome to Bangalore";
        
        // Removing punctuation and converting to lowercase
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        // Splitting the string into words
        String[] words = str.split(" ");
        
        // Creating a map to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        
        // Counting the frequency of each word
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Counting the number of duplicate words
        int duplicateCount = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
                System.out.println("Duplicate word: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
        
       System.out.println("Number of duplicate words: " + duplicateCount);
    }
	
}
