package com.ArraysEx;

import java.util.Arrays;

public class FindLargestElement {
	
	
	
	private static int usingLibrary(){
		
		int[] array = {12,34,56,12,1024,13,454};
		  Arrays.sort(array);
		  return array[array.length - 1];
		  
		 }

	
	 public static void main(final String[] args) {
		 
		       System.out.println("Largest Number : "+usingLibrary());
		 }
		
}
