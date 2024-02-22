package com.dextris;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Login {
	

	public static void main(String[] args) {
		 
        Scanner scanner = new Scanner(System.in) ;
    	
        System.out.println("Enter id:");
        String id = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        
        Configuration con = new Configuration();
        con.configure("NewFile.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session se = sf.openSession();
        Transaction tr = se.beginTransaction();
        
        User user = (User)se.get(User.class, id);
        
        if(user !=null && user.getPassword().equals(password)) {
        	System.out.println("Login Successfully...");
       
        }else {
        	System.out.println("Invalid username or password...");
        }
       se.getTransaction().commit();
    
	}`
}
