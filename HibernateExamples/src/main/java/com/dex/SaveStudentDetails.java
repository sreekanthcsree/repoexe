package com.dex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudentDetails {
	
	public static void main(String[] args) {
	
	Configuration cn=new Configuration();
	cn.configure("NewFile.xml");
	SessionFactory sf=cn.buildSessionFactory();
	Session se=sf.openSession();
	Transaction tr=se.beginTransaction();
	
	Student st=new Student();
	st.setId(155);
	st.setName("Vijay");
	st.setSalary(50000.45);
	
	se.save(st);
	tr.commit();
	}
}
