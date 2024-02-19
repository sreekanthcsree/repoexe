package com.dex;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOneEx {
	public static void main(String[] args) {
		
		Session se=HibernateUtil.getSession();
		Transaction tx=se.beginTransaction();
		
		Address ad1=new Address();
		ad1.setDno(12);
		ad1.sethName("Naga");
		ad1.setCity("Chittoor");
		
		Employee emp1=new Employee();
		emp1.setEid(154);
		emp1.seteName("Prakash");
		emp1.setSalary(30000.45f);
		emp1.setAd(ad1);
		
		se.save(emp1);
		tx.commit();
		System.out.println("Data Successfully inserted...!");
	}

}
