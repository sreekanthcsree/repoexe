package com.abstarction;

public class MethodHidingOne extends MethodHiding{
	
	public void sub() {
		//super.sub();
		super.add();
		System.out.println("sub class");
	}
	
	public static void add() {
		System.out.println("Child class static method...!");
	}
	public static void main(String[] args) {
		MethodHidingOne mo = new MethodHidingOne();
		mo.add();
		mo.sub();
		MethodHiding m = new MethodHiding();
		m.add();
	}
}
