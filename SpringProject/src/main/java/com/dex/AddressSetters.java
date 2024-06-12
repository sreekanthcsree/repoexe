package com.dex;

public class AddressSetters {
	
	int hno;
	String city;
	String state;
	
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Hno : "+hno+",City : "+city+", State : "+state;
	}
	
}
