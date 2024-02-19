package com.threads;

public class OddThread extends Thread{
	
	public void run() {
		for(int i =1;i<=10;i+=2) {
			System.out.println("Odd Thread : "+i);
		}
	}

}
