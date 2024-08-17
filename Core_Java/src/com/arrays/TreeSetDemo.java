package com.arrays;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Sreekanth");
		set.add("Ajith");
		set.add("Ramlal");
		set.add("Thulasi");
		set.add("Sai");
		set.add("Hello");
		set.add("Sreekanth");
		//set.add(null);
		
		
		System.out.println(set);
	}

}
