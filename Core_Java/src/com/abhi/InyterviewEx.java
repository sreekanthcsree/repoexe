package com.abhi;

import java.util.LinkedHashMap;
import java.util.Map;

public class InyterviewEx {
	
	
	public static void main(String[] args) {
		
		String input = "Java is Awesome";
	char firstNonRepetaedChar =findFirstNonRepeatedChar(input);
	System.out.println(firstNonRepetaedChar);


	}

	private static char findFirstNonRepeatedChar(String input) {
		// TODO Auto-generated method stub
		Map<Character,Integer> charCounts=new LinkedHashMap<>();
		input.chars().forEach(c->charCounts.put((char)c,charCounts.getOrDefault((char)c,0)+1));
		char firstNonRepetaedChar = input.chars().mapToObj(c->(char)c)
		                                           .filter(c->charCounts.get(c)==1)
												   .findFirst()
												   .orElseThrow(()->new RuntimeException("no non repfeating char found"));
												   
		return firstNonRepetaedChar;
	}

}
