package com.abhi;

public class InheritanceOne {
	int i;
	int j;
	InheritanceOne(int i,int j){
		this.i=i;
		this.j=j;
	}
	InheritanceOne(){
		System.out.println("default constructor for super class");
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("the addition of two numbers:"+c);
		}
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println("the subtraction of two numbers:"+c);
	}

}
