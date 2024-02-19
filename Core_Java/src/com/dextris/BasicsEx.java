package com.dextris;

public class BasicsEx {
	
	private int id;
	private String name;
	
	public void setName(String na) {
      name=na;
    }	
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return 10;
	}
	public String sree() {
		return "Id is : "+id+"Name is : "+name;
	}
	public void sudha() {
		System.out.println("Id : "+id+" Name : "+name);
	}
	public static void main(String[] args) {
		BasicsEx bx=new BasicsEx();
		//bx.setId(1);
		//bx.setName("sreekanth");
		System.out.println(bx.getId());
		
		System.out.println(bx.sree());
		bx.sudha();
		
	}
}

