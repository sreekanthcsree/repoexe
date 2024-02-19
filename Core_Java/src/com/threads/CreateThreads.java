package com.threads;

public class CreateThreads {
	
	public static void main(String[] args) {
		
		OddThread ot = new OddThread();
		EvenThread et = new EvenThread();
		System.out.println("***Printing the Odd numbers***");
		ot.run();
		System.out.println("***Printing the Even numbers***");
		et.run();
	}

}
