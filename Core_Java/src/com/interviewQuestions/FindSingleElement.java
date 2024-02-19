package com.interviewQuestions;

public class FindSingleElement {

    public static int findSingleElement(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] i = {1, 1, 2, 2, 3, 3, 4,9, 4, 5, 5, 6, 6, 7, 7};
        int result = findSingleElement(i);
        System.out.println("The element that appears only once is: " + result);
    }
}
