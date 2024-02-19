package com.stringsEx;

public class ToStringMethodEx1 {
	int id;
	String name;
	String designation;
	float salary;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDesignation(String des) {
		this.designation=des;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
    public String toString() {
    	return "Id : "+id+" Name : "+name+" Designation : "+designation+" Salary : "+salary;
    }
    
    public static void main(String[] args) {
		ToStringMethodEx1 tex=new ToStringMethodEx1();
		tex.setId(1);
		tex.setName("Sree");
		tex.setDesignation("Java Developer");
		tex.setSalary(40.98f);
		
		System.out.println(tex.toString());
	}
}