package com.collectionDemos;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		list.add(10);
		list.add("Apple");
		list.add(10.14f);
		list.add(1000.23d);
		list.add(100000000L);
		
		List list1 = new ArrayList<>(10);
		list1.add("Banan");
		list1.add("Guava");
		
		
		System.out.println(list.size());
		
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(0);
		System.out.println(list.size());
		
		System.out.println("=======remove===========");
		
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=======addAll()===========");
		
		list.addAll(list1);
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("=======clear()===========");
		list.clear();
		System.out.println("After clear() size would be:"+list.size());
		

	}

}
