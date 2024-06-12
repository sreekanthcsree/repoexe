package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByEx {
	
	public static void main(String[] args) {
		
		List<String> keywords = Arrays.asList("Sreekanth","Sreekanth","Lokesh","Ramlal","Ajith","Nani","Puspharaj");
	    Map<String, List<String>> gropingWords =keywords.stream().collect(Collectors.groupingBy(words->words));
	    System.out.println(gropingWords);
	    
	Map<String, Long> finalResult =keywords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(finalResult);
	                                                                  
	}

}
