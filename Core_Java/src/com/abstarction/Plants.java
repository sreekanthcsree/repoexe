package com.abstarction;

public class Plants implements Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		// The body of animalSound() is provided here
		System.out.println("this is animalSound method");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
	   // The body of sleep() is provided here
		System.out.println("this is sleep method");
	}
public static void main(String[] args) {
	Plants p=new Plants();
	p.animalSound();
	p.sleep();
  }
}