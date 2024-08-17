package com.stringsEx;

import java.util.ArrayList;
import java.util.List;

public class MutableClassesExample {
	
	public static void main(String[] args) {
		
		String s="Hello";
		s = s.concat(" World");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer(s);
		//System.out.println(sb.reverse());
		
		System.out.println(sb.append(" Thulasi"));
		
		List<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		System.out.println(i);
		
		
	}

}
