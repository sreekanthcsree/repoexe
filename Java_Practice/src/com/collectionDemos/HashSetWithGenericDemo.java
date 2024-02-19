package com.collectionDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetWithGenericDemo {
	
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add(null);
		set.add(null);
		set.add("Apple");
		set.add("Banana");

		System.out.println("Size of HashSet:" + set.size());

		System.out.println("===========forEach()============");
		// Type2 is forEach loop

		for (String str : set) {
			System.out.println(str);
		}

		// Type 3 Using Iterator

		System.out.println("===========iterator()============");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String indeVal = itr.next();
			System.out.println(indeVal);
		}
		
		System.out.println(set.contains("Banana"));
		set.clear();
		System.out.println("isEmpty():"+set.isEmpty());

	}
}
