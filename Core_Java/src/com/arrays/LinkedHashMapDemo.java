package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		        //It will follow the IO
				//It will not allow DK
				//It will allow null key once but it will allow multiple times null values
				Map<Integer, String> map = new LinkedHashMap<>();
				map.put(1, "Sreekanth");
				map.put(5, "Nani");
				map.put(4, "Thulasi");
				map.put(9, "Pushpa");
				map.put(2, "Raju");
				map.put(9, "Ajith");
				map.put(10, null);
				map.put(null, null);
				map.put(null, null);
				
				System.out.println(map);
	}

}
