package com.java8Demos;

import java.util.ArrayList;
import java.util.List;

public class LEWithForEachLoop {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Sreekanth");
		list.add("Ramlal");
		list.add("Nani");
		list.add("Puspharaj");
		list.add("Ajith");
		list.add("Satheesh");
		list.add("Raju");
		
		list.forEach(
				 (i)->System.out.println("List of values : "+i)
				);
	}

}
