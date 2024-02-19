package com.ArraysEx;

import java.util.Arrays;

public class RemoveDuplicateElements {
	
	private void removeDuplicate(final int[] a) {

        final int[] temp = new int[a.length];

        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[a.length - 1];

        for (int i = 0; i < j; i++) {
             a[i] = temp[i];
        }

        for (int i = 0; i < j; i++) {
             System.out.println(temp[i]);
        }
    }
	 public static void main(final String[] args) {
		 
		 RemoveDuplicateElements rd = new RemoveDuplicateElements();

	        final int[] a = { 10, 20, 30, 40, 50, 50, 10, 20 };
	        Arrays.sort(a);// sorting an array
	        rd.removeDuplicate(a);
	    }

}
