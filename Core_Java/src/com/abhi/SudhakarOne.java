package com.abhi;

public class SudhakarOne extends Sudhakar{
	
	public void add(int x,int y) {
		
		int z=x+y;
		System.out.println("Child Class : "+z);
	}
	
	public static void main(String[] args) {
		SudhakarOne so=new SudhakarOne();
		so.add(10, 20);
		
	}

}
