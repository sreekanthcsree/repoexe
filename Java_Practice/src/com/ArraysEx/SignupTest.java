package com.ArraysEx;

public class SignupTest {
	
	public static void main(String[] args) {
		
		SignupEx su[] = new SignupEx[2];
		
		su[0] = new SignupEx(101,"sreekanth","password","sree@gmail.com",986647853l);
		su[1] = new SignupEx(102, "sudhakar", "password", "sudhakar@gmail.com", 6754328971l);
		
		//using for each loop to print the o/p
		for(SignupEx se : su) {
			System.out.println(se);
		}
	}

}
