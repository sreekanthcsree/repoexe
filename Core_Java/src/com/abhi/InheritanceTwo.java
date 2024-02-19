package com.abhi;

public class InheritanceTwo extends InheritanceOne {
	int k;
	InheritanceTwo(int i,int j,int k){
		super(i,j);
		this.k=k;
		System.out.println("i = "+super.i+" j = "+super.j+" k = "+this.k);
	}
	InheritanceTwo(){
		super();
		System.out.println("default const for sub-class");
	}
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println("the mul of two numbers:"+c);
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println("the div of two numbers:"+c);
	}
	public static void main(String[] args) { 
		InheritanceTwo ex=new InheritanceTwo(10,20,30);
		InheritanceTwo ex1=new InheritanceTwo();
		ex.add(10,20);
		ex.sub(20,10);
		ex.mul(10,20);
		ex.div(20,10);
	}
} 
