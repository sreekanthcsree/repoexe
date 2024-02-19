package com.dextris;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SignupApplication {
	
	public static void main(String[] args) {
		
           Scanner scanner = new Scanner(System.in) ;
        	
            System.out.println("Enter user ID:");
            int id = scanner.nextInt();
           
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter password:");
            String password = scanner.nextLine();
            
            System.out.println("Enter email:");
            String email = scanner.nextLine();
            
            System.out.println("Enter phoneNum:");
            String phoneNum = scanner.nextLine();
            

            
            Configuration con = new Configuration();//it reads both configuration&mapping files
            con.configure("NewFile.xml");
            SessionFactory sf = con.buildSessionFactory();//read all hibernate configuration details
            Session se = sf.openSession();
            Transaction tr = se.beginTransaction();
			
            //OpenSession : It is not a thread safe,establish a connection from java program to DB.
			//Session :It is used to perform CRUD operations.
            //         *it opens the connection with DB.
            //SessionFactory : It is used to create session object.
            
			  User u = new User(); 
			  u.setId(id);
			  u.setUsername(username); 
			  u.setPassword(password);
			  u.setEmail(email);
			  u.setPhoneNum(phoneNum);
			  
			  se.save(u); 
			  System.out.println("Data inserted successfully...!");
			  tr.commit();		   
        }
    }
