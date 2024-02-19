package com.dextris;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdminApp {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
       	 

        System.out.println("Welcome to Admin Module : ");
        
        System.out.println("Choose your activity :");
        System.out.println("1. Login User");
        System.out.println("2. Update User");
        System.out.println("3. Delete User");
        System.out.println("4. List User");
        System.out.print("Choose another option : ");
        
        
        
        
        int i = scanner.nextInt();
        
       switch (i) {
         case 1:
        	 Scanner scanner1 = new Scanner(System.in) ;
         	
             System.out.println("Enter id:");
             int id = scanner1.nextInt();

             System.out.println("Enter password:");
             String password1 = scanner1.nextLine();
             Session se = HibernateUtil.getSession();
           Transaction tr = se.beginTransaction();
            	
           User user = (User) se.get(User.class, id);
                
              if(user !=null && user.getPassword().equals(password1)) {
                 System.out.println("Login Successfully...");
                }else {
                	System.out.println("Invalid username or password...");
                }
                break;
                
         case 2:
                System.out.println("User updated successfully!");
                break;
         case 3:
            	
             // Delete user logic here
           Session se3 = HibernateUtil.getSession();
           Transaction tr3 = se3.beginTransaction();
           User u2 = (User) se3.get(User.class,new String("sreekanth")); 
           se3.delete(u2);
           tr3.commit();
           System.out.println("User deleted successfully!");
            break;
               
          case 4:
            	
              // List of users logic here
           Session se4 = HibernateUtil.getSession();
           List<User>ulist=se4.createQuery("from User").list();
           ulist.forEach(
            	(x)->System.out.println("Username : "+x.getUsername()+
                       ", Password : "+x.getPassword()+", Email Id : "+x.getEmail()+
                       ", Phone Number : "+x.getPhoneNum()));
            		
                System.out.println("List of users...");
                break;
                
           case 5:
            	System.out.println("exit");
           default:
                System.out.println("Invalid option!");
        }

        scanner.close();//scanner to avoid resource leaks
    }
}
