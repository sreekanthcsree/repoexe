package com.abhi;

public class superKeyword1 extends superKeyword{
	int x=20;
	void display() {
		int x=10;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		superKeyword1 ex=new superKeyword1();
		ex.display();
	}
	

}
