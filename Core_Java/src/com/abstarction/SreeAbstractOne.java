package com.abstarction;

public class SreeAbstractOne extends SreeAbstract{

	@Override
	public void hai() {
		// TODO Auto-generated method stub
		System.out.println("Hai method");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello method");
	}
	public static void main(String[] args) {
		SreeAbstractOne ex=new SreeAbstractOne();
		ex.hai();
		ex.hello();
	}
}
