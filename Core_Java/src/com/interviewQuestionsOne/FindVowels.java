package com.interviewQuestionsOne;

public class FindVowels {
	
	
	public static boolean vowelsPresent(String in) {
		return in.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void main(String[] args) {
		System.out.println(FindVowels.vowelsPresent("Sreekanth"));
		System.out.println(FindVowels.vowelsPresent("bcd"));
	}

}
