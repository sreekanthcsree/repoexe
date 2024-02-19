package com.dextris;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RemoveApp {
	
	public static void main(String[] args) {
	
	Session se = HibernateUtil.getSession();
	Transaction tr = se.beginTransaction();
	
	User u2 = (User) se.get(User.class,new String("anand"));
	//se.delete("kishore", u2);  
	se.delete(u2);
	tr.commit();
    System.out.println("User deleted successfully!");
	}

}
