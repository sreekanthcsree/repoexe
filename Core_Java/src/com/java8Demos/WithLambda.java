package com.java8Demos;


interface Table{
	public void hai();
}

public class WithLambda {

	public static void main(String[] args) {
		int b=20;
		Table t = ()->{ System.out.println(b);
	};
	t.hai();
}
}
