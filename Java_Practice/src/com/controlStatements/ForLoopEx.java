package com.controlStatements;

import java.util.Scanner;

public class ForLoopEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial value : ");
		int i = sc.nextInt();
		
		System.out.println("Enter the target value : ");
		int t = sc.nextInt();
		
		int count =0;
		for(int j=i;j<=t;j++) {
			System.out.println(" "+j);
			count = count+j;
		}
		System.out.println();
		System.out.println("Count of nums : "+count);
		
	}

}
