package com.CloudTech;

import java.util.Random;
import java.util.Scanner;

//input=5
//output=5 random numbers
public class RandomNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Random numbers to be generated:");
		int n=sc.nextInt();
		
		Random ran=new Random();
		ran.ints(1,20).limit(n).forEach(System.out::println);
	}

}
