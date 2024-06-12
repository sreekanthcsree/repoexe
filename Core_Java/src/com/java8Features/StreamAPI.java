package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		List<String> startsWith = Arrays.asList("Sreekanth","Sreekanth","Lokesh","Ramlal","Ajith","Nani","Puspharaj");
		        startsWith.stream().filter(name->name.startsWith("S")).forEach(System.out::println);
		        
		       List<String> duplicateEle = startsWith.stream().distinct().collect(Collectors.toList());
		        System.out.println(duplicateEle);
	}

}
