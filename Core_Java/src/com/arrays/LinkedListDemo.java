package com.arrays;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		LinkedList<Integer> list1 =new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(2);
		list1.add(40);
		list1.add(80);
		list1.add(5);
		list1.add(80);
		
		list.add(200);
		list.add(300);
		

		list1.addAll(list);
		System.out.println(list1);
		list1.addFirst(0);
		list1.addLast(400);
		System.out.println(list1);
		System.out.println("getFirst(): "+list1.getFirst());
		System.out.println("getLast(): "+list1.getLast());
		list1.removeFirst();
		list1.removeLast();
		System.out.println(list1);
		System.out.println(list1.removeAll(list1));//It return boolean value
		System.out.println(list1);
		

	}

}
