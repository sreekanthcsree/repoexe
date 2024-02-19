package com.abhi;

public class ThisKeyword {
	
	int x=10;//instance variable
	
	void display() {
		int x=20;//local variable
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		ThisKeyword ex=new ThisKeyword();
		ex.display();
	}
}
