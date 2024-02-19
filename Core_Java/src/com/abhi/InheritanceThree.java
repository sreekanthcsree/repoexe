package com.abhi;

public class InheritanceThree extends InheritanceTwo {
	public void rem(int a,int b) {
		int c=a%b;
		System.out.println("the remainder:"+c);
	}
	public static void main(String[] args) {
		InheritanceThree ex=new InheritanceThree();
		ex.add(10,20);
		ex.sub(20,10);
		ex.mul(10,20);
		ex.div(20,10);
		ex.rem(54,25);
	}

}
