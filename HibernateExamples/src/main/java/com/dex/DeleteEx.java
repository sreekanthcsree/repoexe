package com.dex;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteEx {
	
	public static void main(String[] args) {
		Session se=HibernateUtil.getSession();
		Transaction tx=se.beginTransaction();
		
		Student st=(Student)se.get(Student.class, new Integer(155));
		se.delete(st);
		tx.commit();
		System.out.println("Successfully record deleted...!");
	}
}
