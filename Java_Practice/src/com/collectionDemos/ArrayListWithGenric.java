package com.collectionDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListWithGenric {
	
public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Guava");
		list.add("Orange");
		list.add("Apple");
		list.add("Apple");
		list.add(null);
		
		// for loop
		
		System.out.println("===========for()============");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===========forEach()============");
		// Type2 is forEach loop
		
		for(String str : list) {
			System.out.println(str);
		}
		
		// Type 3 Using Iterator
		
		System.out.println("===========iterator()============");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String indeVal = itr.next();
			System.out.println(indeVal);
		}
		
		//Type 4 java8 streams
		System.out.println("===========java8()============");
		
		
		list.forEach(System.out::println);
		
		//Type 4 java8 streams
		System.out.println("===========listIterator() forward direction============");
		
		ListIterator<String> litr = list.listIterator();
	
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("===========listIterator() backward direction============");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}	
		
		System.out.println("===========toArray()============");
		
		Object[] strArr = list.toArray();
		for(Object str : strArr) {
			System.out.println(str);
		}
	}

}
