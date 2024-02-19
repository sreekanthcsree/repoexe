package com.patternExamples;

public class SquareDemo {
	
	public static void main(String[] args) {
		
		//Outer for loop is handle to rows
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
