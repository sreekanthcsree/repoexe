package com.dex;


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindEmployee {
	
	public static void main(String[] args) {
		
		Configuration co = new Configuration();
		co.configure("NewFile.xml");
		SessionFactory sf =co.buildSessionFactory();
		Session se = sf.openSession();
		
		List<Employee> elist = se.createCriteria(Employee.class).list();
		
		//using for each loop
		for(Employee e : elist) {
			System.out.println("Empoyee Id : "+e.getId()+" Employee Name : "+e.getUsername()+" Salary : "+e.getSalary());
		}
		
		
		
	}

}
