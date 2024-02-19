package com.collectionDemos;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationExceptionDemo {
	
public static void main(String[] args) {
		
		//Set<String> set = new LinkedHashSet<>();
		Set<String> set = new CopyOnWriteArraySet<>();
		set.add("Banana");
		set.add("Apple");
		set.add("Apple");
		set.add("Banana");

		System.out.println("Size of HashSet:" + set.size());

		System.out.println("===========forEach()============");
		// Type2 is forEach loop

		for (String str : set) {
			if(str.equalsIgnoreCase("Banana")) {
				set.remove("Banana"); // concurrentModificationException
			}
			System.out.println(str);
		}

		// Type 3 Using Iterator

		System.out.println("===========iterator()============");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String indeVal = itr.next();
			System.out.println(indeVal);
		}

	}

}
