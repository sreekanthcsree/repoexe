package com.abhi;

public class Sree1 {
	float salary=2;
	
	public void salary() {
		if(salary>7) {
			System.out.println("'a+' grade:");
			
		}else if(salary>5){
			System.out.println("'a' grade:");
		}else if(salary>3) {
			System.out.println("'b' grade");
		}else if(salary>2) {
			System.out.println("'c' grade");
		}else if(salary>1) {
			System.out.println("'d' grade");
		}
		else {
			System.out.println("no grade");
		}
		
	}
	public static void main(String[] args) {
		Sree1 ex=new Sree1();
		ex.salary();
	}

}
