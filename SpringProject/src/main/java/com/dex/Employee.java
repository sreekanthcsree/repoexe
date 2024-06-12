package com.dex;

public class Employee {
	
	int id;
	String name;
	float salary;
	Address add;
	
	
	public Employee(Address add) {
		this.add = add;
	}
	public Employee(){
		System.out.println("Default Constructor");
	}
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("2 argumented constructor");
	}
	public Employee(int id,String name,float salary,Address add){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.add=add;
		System.out.println("3 argumented constructor");
	}
	@Override
	public String toString() {
		return "Employee id: "+id+"Name: "+name+"Salary: "+salary+add.toString();
	}

}

