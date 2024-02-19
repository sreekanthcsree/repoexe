package com.abhi;

public class ThisKeyword1 {
	
	int x;
	
	ThisKeyword1(int x){
		 this.x=x;
	}
	void display() {
		System.out.println(x);
	}
	public static void main(String[] args){
		ThisKeyword1 ex=new ThisKeyword1(4);
		ex.display();
	}
}
