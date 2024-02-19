package com;

import java.util.Arrays;

public class SwappingNumber {

	public static void main(String[] args) {
		
		int[] arry1 = { 1, 2, 3, 4, 5 };
		int[] arry2 = { 7, 8, 9, 4, 3 };

		int temp1 = arry1[0];
		int temp2 = arry1[1];
		System.out.println(temp1);
		System.out.println(temp2);
		int temp3 = arry2[0];
		int temp4 = arry2[1];
		System.out.println(temp3);
		System.out.println(temp4);

		arry2[0]=temp1;
		arry2[1]=temp2;
		arry1[0]=temp3;
		arry1[1]=temp4;
		System.out.println(Arrays.toString(arry1));
		System.out.println(Arrays.toString(arry2));
	}

}
