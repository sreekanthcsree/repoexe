package com.CloudTech;

public class PrimeNumber {
	
	public static boolean prime(int n) {
		if(n<2) {	
		  return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%1==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	int n=17;
	if(prime(n)) {
		System.out.println("this number is a prime number");
	}else {
		System.out.println("this is number is not a prime number");
	}
}
}
