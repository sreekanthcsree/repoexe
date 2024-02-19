package com.dex;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToManyEx {
	
	public static void main(String[] args) {
		Session se = HibernateUtil.getSession();
		Transaction tr=se.beginTransaction();
		
		Course c=new Course();
		c.setCid(1);
		c.setCname("Java");
		c.setFees(25000f);
		
		Course c1=new Course();
		c1.setCid(2);
		c1.setCname("Python");
		c1.setFees(30000f);
		
		Institute i=new Institute();
		i.setIid(101);
		i.setIname("ABC");
		i.setIloc("Bangalore");
		
		List<Course>list=new ArrayList<Course>();
		list.add(c);
		list.add(c1);
		
		i.setCo(list);
		
		se.save(i);
		tr.commit();
		System.out.println("Record has been successfully inserted...!");
		
	}

}
