package com.stringsEx;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	
	
	private static void findDuplicate(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		String str = "hi hello welcome to bangalore";
		System.out.println("Duplicate characters : ");
		findDuplicate(str);
	}

}
