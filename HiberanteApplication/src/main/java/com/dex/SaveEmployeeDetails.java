package com.dex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SaveEmployeeDetails {
	
	public static void main(String[] args) {
		 
		Configuration cnf = new Configuration();
		cnf.configure("NewFile.xml");
		SessionFactory sf = cnf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		
		Employee emp = new Employee(); 
		emp.setId(123); 
		emp.setUsername("Sudhakar");
	    emp.setSalary(22000l); 
		se.saveOrUpdate(emp);
		 
		
		Employee emp1 = new Employee();
		emp1.setId(124);
		emp1.setUsername("Dileep");
		emp1.setSalary(25000l);
		se.save(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(125);
		emp2.setUsername("Rahul");
		emp2.setSalary(21000l);
		se.save(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(126);
		emp3.setUsername("Sreekanth");
		emp3.setSalary(18000l);
		se.save(emp3);

		Employee emp4 = new Employee();
		emp4.setId(127);
		emp4.setUsername("Rohan");
		emp4.setSalary(26000l);
		se.save(emp4);
		
		tr.commit();
	}
}
