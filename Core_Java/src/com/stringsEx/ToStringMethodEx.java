package com.stringsEx;

public class ToStringMethodEx {
	int id;
	String name;
	float salary;
	
	public ToStringMethodEx() {
		System.out.println("Default constructor");
	}
	
	public ToStringMethodEx(int i,String n,float s) {
		this.id=i;
		this.name=n;
		this.salary=s;
	}
	
@Override
	public String toString() {
		return "Id : " + id + " Name : " + name + " Salary : " + salary;
	}

public static void main(String[] args) {
	ToStringMethodEx ex=new ToStringMethodEx();
	ToStringMethodEx ex1=new ToStringMethodEx(101, "Sree", 50000.56f);
	System.out.println(ex1);
}
}
