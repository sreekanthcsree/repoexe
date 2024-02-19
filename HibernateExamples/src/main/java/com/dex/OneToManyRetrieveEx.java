package com.dex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class OneToManyRetrieveEx {
	public static void main(String[] args) {
		Session se=HibernateUtil.getSession();
		
		List<Institute>ilist=se.createQuery("from Institute").list();
		Iterator<Institute>ii=ilist.iterator();
		while(ii.hasNext()) {
			Institute sn=ii.next();
			System.out.println("Institute Id : "+sn.getIid()+" Institue Name : "+sn.getIname()+" Location : "+sn.getIloc());
			List<Course>li=sn.getCo();
			li.forEach(
					(x)->System.out.println("Course Id : "+x.getCid()+" Course Name : "+x.getCname()+" Fees : "+x.getFees())
					);
			
		}
	}

}
