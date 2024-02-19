package com.abhi;

public class SwitchExample {
	
	public void month() {
		int q=4;
	switch(q) {
	
	case 1:
		System.out.println("January");
		break;
	case 2:
		System.out.println("Febraury");
		break;
	case 3:
		System.out.println("March");
		break;
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("May");
		break;
	default:
		System.out.println("Invalid month");
		break;
	}	 
	}
	public static void main(String[] args) {
		SwitchExample ex=new SwitchExample();
		ex.month();
	}
}
