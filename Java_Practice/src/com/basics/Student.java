package com.basics;

public class Student {
	
	int id;
	String name;
	String course;
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.id = 153;
		st.name = "Sree"; 
		st.course = "Java";
		
		System.out.println("Id : "+st.id+", Name : "+st.name+", Course : "+st.course);
		System.out.println("=======================================");
		System.out.println("Student Id     : "+st.id);
		System.out.println("Student Name   : "+st.name);
		System.out.println("Student Course : "+st.course);
	}

}
