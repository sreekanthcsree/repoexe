package com.arrays;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		//It will follow the natural order
		//It will not allow DK
		//It will not allow null keys once
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Sreekanth");
		map.put(5, "Nani");
		map.put(4, "Thulasi");
		map.put(9, "Pushpa");
		map.put(2, "Raju");
		map.put(9, "Ajith");
		map.put(10, null);
		//map.put(null, null);
		
		
		System.out.println(map);
	}

}
