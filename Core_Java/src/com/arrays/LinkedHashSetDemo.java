package com.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		Set<String> set =new LinkedHashSet<>();
		set.add("Sreekanth");
		set.add("Ajith");
		set.add("Ramlal");
		set.add("Thulasi");
		set.add("Sai");
		set.add("Hello");
		set.add("Sreekanth");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}

}
