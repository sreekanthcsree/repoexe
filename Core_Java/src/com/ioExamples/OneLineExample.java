package com.ioExamples;

public class OneLineExample {

	public static void main(String[] args) {

		String s="Ajith";
		String s1=s.substring(2);
		System.out.println(s1);
		String s2=s.substring(0,3);
		System.out.println(s2);
		String s3=s.substring(1,7);//Exception
		System.out.println(s3);
	}
}
