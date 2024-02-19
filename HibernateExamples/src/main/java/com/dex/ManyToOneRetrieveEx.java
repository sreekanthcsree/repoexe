package com.dex;

import java.util.List;

import org.hibernate.Session;

public class ManyToOneRetrieveEx {
	public static void main(String[] args) {
		Session se=HibernateUtil.getSession();
		
		List<Departments>dlist=se.createQuery("from Departments").list();
		dlist.forEach(
				(ab)->System.out.println("Id : "+ab.getDid()+" Name : "+ab.getSname()+" Dept Name : "+ab.getDname()+" Door No : "+ab.getUv().getUid()+" Name : "+ab.getUv().getUname()+" Location : "+ab.getUv().getUloc())
				);
	}
}