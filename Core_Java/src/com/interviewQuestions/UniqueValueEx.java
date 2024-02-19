package com.interviewQuestions;

import java.util.HashSet;

public class UniqueValueEx {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};

        // Create a HashSet to store unique values
        HashSet<Integer> uniqueValues = new HashSet<>();

        // Iterate through the array and add unique values to the HashSet
        for (int i : arr) {
            uniqueValues.add(i);
        }

        // Print the unique values
        System.out.println("Unique values in the array:");
        for (int uniqueValue : uniqueValues) {
            System.out.print(uniqueValue+" ");
        }
    }
}
