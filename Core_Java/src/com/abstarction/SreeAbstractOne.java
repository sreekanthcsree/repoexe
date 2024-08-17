package com.abstarction;

public class SreeAbstractOne extends SreeAbstract{

	public static void main(String[] args) {
		SreeAbstractOne ex=new SreeAbstractOne();
		ex.hai();
		ex.hello();
	}

	@Override
	public void hai() {
		// TODO Auto-generated method stub
		System.out.println("hai()");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello()");
	}
}
