package com.consoleApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserEx {
	
	  public static void main(String[] args) {
		  
	        List<User> userList = new ArrayList<User>();
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("Select an option:");
	            System.out.println("1. Add User");
	            System.out.println("2. List Users");
	            System.out.println("3. Login User");
	            System.out.println("4. Exit");

	            int option = scanner.nextInt();
	            scanner.nextLine();

	            switch (option) {
	                case 1:
	                    System.out.println("Enter user ID :");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.println("Enter user name :");
	                    String name = scanner.nextLine();
	                    System.out.println("Enter password :");
	                    String password = scanner.nextLine();
	                    System.out.println("Enter emailId :");
	                    String emailId = scanner.nextLine();
	                    System.out.println("Enter MobileNo :");
	                    String mobileNo = scanner.nextLine();
	                    userList.add(new User(id, name, password, emailId, mobileNo));
	                    System.out.println("User added successfully.");
	                    break;
	                case 2:
	                    System.out.println("List of Users :");
	                    for (User user : userList) {
	                        System.out.println(user);
	                    }
	                    break;
	                case 3:
	                	String validName = "admin";
	                    String validPassword = "password@123";
	                    System.out.println("Welcome to the Login System!");

	                    System.out.print("Enter your username : ");
	                    String username = scanner.nextLine();

	                    System.out.print("Enter your password : ");
	                    String pass = scanner.nextLine();

	                    // Check if the entered username and password match the valid credentials
	                    if (username.equals(validName) && pass.equals(validPassword)) {
	                        System.out.println("Login successful! Welcome, " + username + ".");
	                    } else {
	                        System.out.println("Invalid username or password. Please try again.");
	                    }        
	                    break;
	                case 4:
	                	System.out.println("Exiting...");
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	            }
	        }
	        scanner.close();
	    }
	}
