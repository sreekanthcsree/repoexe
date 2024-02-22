package com.collectionsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ClearNRemove {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Collection<Integer> list1 = new ArrayList<Integer>();

        list.add(60);
        list.add(70);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(60);
        
        list1.add(30);
        list1.add(50);
        list1.add(40);
        list1.add(60);
        
        System.out.println(list1);
        list1.clear();
        System.out.println("After clear() method : "+list1);
        
       System.out.println(list);
       System.out.println("Before remove method : "+list.size());
       int i = list.remove(1);
       System.out.println(i);
       System.out.println("After remove method : "+list.size());
       System.out.println("=============clear() method===========================");
       
           // Create an ArrayList and initialize it with some elements
           ArrayList<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
    
           // Display the list before clearing
           System.out.println("List before clearing: " + list);
    
           // Clear the list
           list.clear();
    
           // Display the list after clearing
           System.out.println("List after clearing: " + list);
       }
	}
