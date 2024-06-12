package com.dex;

public class Sreekanth {
	
	int id;
	String fullName;
	String city;
	String state;
	
	public Sreekanth(int id,String fullName,String city,String state) {
		this.id=id;
		this.fullName=fullName;
		this.city=city;
		this.state=state;
	}
	public void display() {
		System.out.println("Id : "+id+", Name : "+fullName+", City : "+city+", State : "+state);
	}

}
