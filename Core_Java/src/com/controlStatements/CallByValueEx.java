package com.controlStatements;

public class CallByValueEx {
	int data=10;
	public void add(int data) {
		data=data+20;
		System.out.println("addition : "+data);
	}
	public static void main(String[] args) {
		CallByValueEx ex=new CallByValueEx();
		ex.add(300);
		System.out.println("Before Change : "+ex.data);
		System.out.println("After : "+ex.data);
	}
}
