package com;

public class ReverseStringPositions {
	
    public static String reverseWords(String input) {
    	
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	//reverse the String positions
        String str = "java is back end language";
        String reversedString = reverseWords(str);
        System.out.println(reversedString);
    }
}
