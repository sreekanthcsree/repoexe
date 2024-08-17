package com.abstarction;

public class EncapsulationDemo {
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void sree() {
		System.out.println(id+" "+name);
	}
	
	@Override
	public String toString() {
		return "EncapsulationDemo id : " + id + ", name : "+ name;
	}
	
	
	
	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		e.setId(1);
		e.setName("Thulasi");
		e.sree();
	System.out.println(e.toString());
		
	}

}
