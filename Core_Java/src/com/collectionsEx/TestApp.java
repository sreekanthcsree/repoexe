package com.collectionsEx;

import java.util.LinkedList;
import java.util.List;

public class TestApp {
	
	
	public static void main(String[] args) {
		
	   List<Integer> list = new LinkedList<Integer>();
	   LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(80);
		
		list1.add(100);
		list1.add(200);
		list.addAll(list1);
	
		System.out.println("List of the values : "+list);
		list.remove(4);
		System.out.println("Remove method : "+list);
		list.clear();
		System.out.println("Clear method : "+list);
	}
}
