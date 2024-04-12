package com.dexDrive;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWordsOne {
	
	public static void main(String[] args) {
        String str = "welcome to java and welcome to Bangalore";

        // Removing punctuation and converting to lowercase
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Splitting the string into words and counting frequencies using streams
        Map<String, Long> wordFrequencyMap = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Counting the number of duplicate words and printing them
        int duplicateCount = 0;
        for (Map.Entry<String, Long> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
                System.out.println("Duplicate word: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }

        System.out.println("Number of duplicate words: " + duplicateCount);
    }

}
