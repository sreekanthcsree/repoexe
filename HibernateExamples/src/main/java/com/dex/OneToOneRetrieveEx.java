package com.dex;

import java.util.List;

import org.hibernate.Session;

public class OneToOneRetrieveEx {

	public static void main(String[] args) {
	  Session se=HibernateUtil.getSession();
	  
	  //Retrieve the values
	  List<Employee>list=se.createQuery("from Employee").list();
	  
	  list.forEach(
			  (em)->System.out.println("Employee ID : "+em.getEid()+" Employee Name : "+em.geteName()+" Salary : "+em.getSalary()+
					  "Door No : "+em.getAd().getDno()+" House Name : "+em.getAd().gethName()+" City : "+em.getAd().getCity())
			  );	
	}
}