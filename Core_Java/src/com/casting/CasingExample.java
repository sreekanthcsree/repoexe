package com.casting;


class Employee
{
	public void employeeMethod()
	{
		System.out.println("Hi i am employee method");
	}
}
class Student extends Employee
{
	public void studentMethod()
	{
		System.out.println("Hi i am student method");
	}
}


public class CasingExample {

	public static void main(String[] args) {
		Employee employee=new Student();
		employee.employeeMethod();
		Student student=(Student)employee;
		student.employeeMethod();
		student.studentMethod();
		
		
	}

}
