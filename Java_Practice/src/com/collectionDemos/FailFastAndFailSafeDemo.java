package com.collectionDemos;

import java.util.ArrayList;

public class FailFastAndFailSafeDemo {
	
public static void main(String[] args) {
		
		//CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Guava");
		
		// iterator the data elelents
		
		for(String str : list) {
			
			if(str.equalsIgnoreCase("Banana")) {
				list.add("Mango");
			}
			
			System.out.println(str);
		}
	}
}
