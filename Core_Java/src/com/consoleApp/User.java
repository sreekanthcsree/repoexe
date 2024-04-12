package com.consoleApp;

public class User {
	
	int id;
	String name;
	String password;
	String email;
	String mobNo;
	public User(int id, String name, String password, String email, String mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Id : "+id+ ", Name : "+name+", Password : "+password+", emailId : "+email+", mobileNo : "
				+mobNo;
	}

}
