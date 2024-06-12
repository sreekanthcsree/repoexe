package com.dex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstMailClass {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
	    Employee emp = (Employee) ctx.getBean("e1");
	    System.out.println(emp.toString());
	    
	    Address add = (Address)ctx.getBean("a1");
	    System.out.println(add.toString());
	}

}
