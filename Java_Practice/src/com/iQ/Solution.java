package com.iQ;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	
	public static boolean solution(int[] A) {
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(int num : A) {
			countMap.put(num, countMap.getOrDefault(num,0)+1);
		}
		for(int count : countMap.values()) {
			if(count %2 > 0) {
				return false;
			}
		}
		return true;
		
     }
	public static void main(String[] args) {
		int[] array1 = {1,2,2,1};
        boolean result1 = solution(array1);
        System.out.println("Result 1: " + result1); 

        int[] array2 = {7,7,7};
        boolean result2 = solution(array2);
        System.out.println("Result 2: " + result2);
        
        int[] array3 = {1,2,2,3};
        boolean result3 = solution(array3);
        System.out.println("Result 3: " + result3);
	}
}

