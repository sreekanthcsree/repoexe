package com.ArraysEx;

import java.util.Arrays;

public class CheckTwoArraysEqual {
	
	public static void main(String[] args) {
		
		int[] i1 = {1,2,3,4,5};
		int[] i2 = {1,2,3,4,9};
		
		Boolean b = Arrays.equals(i1, i2);
		System.out.println("Two Arrays are equal : "+b);

	}

}
