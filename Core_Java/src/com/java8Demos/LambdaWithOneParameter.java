package com.java8Demos;


interface Glass{
	public void add(String name);
	//public String add(String name);
}
public class LambdaWithOneParameter {
	
	public static void main(String[] args) {
		Glass g = (name)->{
			//return "Name : "+name;
			System.out.print(name);
		};
		//System.out.println(g.add("Sreekanth"));
		g.add("Hello");

	}
}
