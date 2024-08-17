package com.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//ArrayList syntax
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(2);
		list.add(40);
		list.add(80);
		list.add(5);
		list.add(80);
		
		System.out.println(list);
		
		//forEach loop
		for(int i : list) {
			System.out.println(i);
		}
		//using Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(list.size());
		System.out.println(list.contains(100));
		System.out.println(list.indexOf(40));
		System.out.println(list.get(4));
		
	}

}
