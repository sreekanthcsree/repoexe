package com.java8Demos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
	   List<String> list =	Arrays.asList("Ramlal","Ajith","Raju","Arjun","Satheesh","Puspharaj","Satheesh","Nani","Sreekanth");
	   List<String> list1 = list.stream().distinct().collect(Collectors.toList());
	   System.out.println(list1);
	   System.out.println("=================================");
	   
	   list.stream().distinct().forEach(s->System.out.println(s));//print the list of values
	 
	   System.out.println("=================================");
	   Long l = list.stream().distinct().count();
	   System.out.println("Count the list of values : "+l);
	   
	   System.out.println("=================================");
	   Set<String> list3 = list.stream().collect(Collectors.toSet());
	   System.out.println("Print the list of values using set : "+list3);
	   
	   System.out.println("=================================");
	   List<String> list4 = list.stream().distinct().filter(str->str.toLowerCase().startsWith("a")).collect(Collectors.toList());
	   System.out.println(list4);
	}

}
