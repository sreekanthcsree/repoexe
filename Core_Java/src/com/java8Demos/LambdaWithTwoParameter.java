package com.java8Demos;


interface Plate{
	public void sub(int id,String concept);
}
public class LambdaWithTwoParameter {
	
	public static void main(String[] args) {
		Plate p = (id,concept)->{
			System.out.println("Id : "+id+",Concept : "+concept);
		};
		p.sub(1,"Lambda Expression...!");
		p.sub(2, "Java8Features...!");
	}

}
