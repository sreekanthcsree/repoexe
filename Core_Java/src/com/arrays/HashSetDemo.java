package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
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
