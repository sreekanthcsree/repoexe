package com.abstarction;

public class MainThread implements Runnable {
	
	private  int value;

	@Override
	public void run() {
	  value=10;	
	}

	public int getValue() {
		return value;
	}
	public static void main(String[] args)throws Exception {
		MainThread mt=new MainThread();
		Thread th=new Thread(mt);
		th.start();
		th.join();
		int va=mt.getValue();
		System.out.println("Returning a value is : "+va);
	}
}
