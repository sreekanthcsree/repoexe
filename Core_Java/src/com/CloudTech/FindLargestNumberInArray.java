package com.CloudTech;

import java.util.Arrays;

public class FindLargestNumberInArray {
	public static void main(String[] args) {
		int a[]= {10,20,46,78,95,49};
		
		Arrays.sort(a);
		int large=a[a.length-1];
		System.out.println("the largest number is : "+large);
	}
}
