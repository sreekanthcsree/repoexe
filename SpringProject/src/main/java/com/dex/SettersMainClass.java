package com.dex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SettersMainClass {
	
	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("NewFile.xml");
		
	    EmployeeSetters es = (EmployeeSetters) ct.getBean("emp1");
	    System.out.println(es.toString());
	    
	    AddressSetters as = (AddressSetters)ct.getBean("add1");
	    System.out.println(as.toString());
	
	}

}
