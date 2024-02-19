package com.CloudTech;

//input=1234
//output=4321
public class ReverseNumber {
	public static void main(String[] args) {
		int num=1234;
	    StringBuilder sb=new StringBuilder(String.valueOf(num));
		int reverse=Integer.valueOf(sb.reverse().toString());
		System.out.println("Reverse Number is : "+sb);
		System.out.println("-----------------------------------");
		
		
		int number=1234;
		int rev =0;
		while(number!=0) {
			int rem=number%10;
			rev=rev*10+rem;//43
			number=number/10;//21
			System.out.println("Reverse num is: "+rev);
		}	
	}
}
