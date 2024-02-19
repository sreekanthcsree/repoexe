package com.dextris;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateUserDetails {
	
	public static void main(String[] args) {
		
	Session se = HibernateUtil.getSession();
 	Transaction tr = se.beginTransaction();
 	
 	
 	Scanner scanner = new Scanner(System.in);
 	
 	System.out.println("Enter user ID to update: ");
    int userId = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    System.out.println("Enter new username: ");
    String newUsername = scanner.nextLine();
    
    System.out.println("Enter new password: ");
    String password = scanner.nextLine();

    System.out.println("Enter new email: ");
    String newEmail = scanner.nextLine();

    // Begin a transaction
    Transaction transaction = null;
    try {
        transaction = se.beginTransaction();

        // Retrieve the user by ID
        User user =(User) se.get(User.class, userId);

        if (user != null) {
            // Update user details
        	//user.setId(userId);
        	user.setId(userId);
            user.setUsername(newUsername);
            user.setEmail(newEmail);
            user.setPassword(password);

            // Save the updated user
            se.update(user);

            // Commit the transaction
            transaction.commit();

            System.out.println("User details updated successfully!");
        } else {
            System.out.println("User not found with ID: " + userId);
        }
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    } finally {
        // Close resources
        se.close();
        scanner.close();
    }
	}
}