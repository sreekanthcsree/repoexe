package com.java8Demos;


interface Drawable{
	
	public void hello();
}

public class WithoutLambda {
	
	public static void main(String[] args) {
		int a=10;
		Drawable d = new Drawable() {
			
			//without lambda, Drawable implementation using anonymous class  
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println(a);
			}
		};
		d.hello();
	}

}
