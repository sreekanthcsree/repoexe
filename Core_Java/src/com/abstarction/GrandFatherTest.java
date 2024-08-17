package com.abstarction;

public class GrandFatherTest implements GrandFather{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Method");
	}
	public static void main(String[] args) {
		GrandFatherTest t = new GrandFatherTest();
		t.add();
	}

}
