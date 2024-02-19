package com.dex;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManyToOneEx {
	
	public static void main(String[] args) {
       Session se = HibernateUtil.getSession();
       Transaction tr=se.beginTransaction();
       
       University u=new University();
       u.setUid(1510214);
       u.setUname("SKUCET");
       u.setUloc("Anantapur");
       
       Departments d=new Departments();
       d.setDid(1);
       d.setDname("ECE");
       d.setSname("Sreekanth");
       
       Departments d1=new Departments();
       d1.setDid(2);
       d1.setDname("Ramlal");
       d1.setSname("Mechanical Engineering");
       
       d.setUv(u);
       se.save(d);
       se.save(d1);
       tr.commit();
       System.out.println("Data has been inserted...!");
       
	}

}
