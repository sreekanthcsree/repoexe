package com.dextris;

public interface ExampleOne {
	
	public void m1();
//	public void m2();
	public default void m3(String a,String b) {
		String c = a+b;
		System.out.println(c);
	}

}
