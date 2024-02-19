package com.abstarction;

public class InterfaceFinal implements FirstInterface,SecondInterface {

	@Override
	public void firstMethod() {
		// TODO Auto-generated method stub
		System.out.println("Hai");
	}
	@Override
	public void secondMethod() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

public static void main(String[] args) {
InterfaceFinal ex=new InterfaceFinal();
ex.firstMethod();
ex.secondMethod();
  }
}
	