package com.abhi;

public class Sree2 {
	int marks=75;
	public void marks() {
		if(marks>=80 && marks<90) {
			System.out.println("A grade:");
		}else if(marks>=70 && marks<80) {
			System.out.println("B grade:");
		}else if(marks>=55 && marks<65) {
			System.out.println("C grade:");
		}else if(marks>=38 && marks<45) {
			System.out.println("D grade:");
		}else if(marks<35) {
			System.out.println("fail");
		}else {
			System.out.println("invalid marks");
		}
		
	}
	public static void main(String[] args) {
		Sree2 ex=new Sree2();
		ex.marks();
	}

}
