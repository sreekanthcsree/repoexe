package com.dex;

public class EmployeeSetters {
	
	int id;
	String name;
	float salary;
	AddressSetters add;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setAdd(AddressSetters add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Id : "+id+", name : "+name+", salary : "+salary+", add : "+add;
	}
	
}
