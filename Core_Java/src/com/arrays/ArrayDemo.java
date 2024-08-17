package com.arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//datatype [][] refe_var = new int[declare size][];
		int[] i = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 50;
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		String[] s = new String[3];
		s[0]="Sree";
		s[1]="Hello";
		
		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
		}
	}

}
