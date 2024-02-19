package com.dex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetStudentDetails {
	
	public static void main(String[] args) {
		
		Configuration cnf=new Configuration();
		cnf.configure("NewFile.xml");
		SessionFactory sf=cnf.buildSessionFactory();
		Session se=sf.openSession();
		//to get details
		//for loop
		List<Student>slist=se.createCriteria(Student.class).list();
		for(int i=0;i<slist.size();i++) {
			Student st=slist.get(i);
			System.out.println("Student Id : "+st.getId()+" Student Name : "+st.getName()+" Salary : "+st.getSalary());
			System.out.println("--------------------------------------------------------------------------");
		}
		//for each loop
			for(Student st:slist) {
				System.out.println("Student Id : "+st.getId()+" Student Name : "+st.getName()+" Salary : "+st.getSalary());
				System.out.println("--------------------------------------------------------------------------");	
		}
		//Iterator
			Iterator<Student>itr=slist.iterator();
			while(itr.hasNext()) {
				Student st=itr.next();
				System.out.println("Student Id : "+st.getId()+" Student Name : "+st.getName()+" Salary : "+st.getSalary());
				System.out.println("--------------------------------------------------------------------------");	
			}
		//lambda expression
			slist.forEach(
					(x)->System.out.println("Student Id : "+x.getId()+" Student Name : "+x.getName()+" Salary : "+x.getSalary())

					);
	}

}
