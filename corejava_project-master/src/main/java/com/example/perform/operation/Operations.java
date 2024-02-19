package com.example.perform.operation;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repository.UserRepository;
import com.example.service.UserService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Component
public class Operations {
	@Autowired
	UserService userService;
	@Autowired
	private UserRepository userRepository;
	
    Scanner sc = new Scanner(System.in);
    
    // checkingCredentials for ADMIN -->
    public boolean checkCredentialsAdmin() {
    	System.out.println(" Enter your username --> ");
    	String username = sc.next();
    	System.out.println(" Enter your passward --> ");
    	String passward = sc.next();
    	boolean result = this.userService.checkCredentialsADMIN(username, passward);
    	if(result == true) {
    		return true;
    	}
    	return false;
    }
    
    // checkingCredentials for EMPLOYEE -->
    public boolean checkCredentialsEmployee() {
    	System.out.println(" Enter your username --> ");
    	String username = sc.next();
    	System.out.println(" Enter your passward --> ");
    	String passward = sc.next();
    	boolean result = this.userService.checkCredentialsEMP(username, passward);
    	if(result == true) {
    		return true;
    	}
    	return false;
    }
    
    // checkingCredentials for HR -->
    public boolean checkCredentialsHr() {
    	System.out.println(" Enter your username --> ");
    	String username = sc.next();
    	System.out.println(" Enter your passward --> ");
    	String passward = sc.next();
    	boolean result = this.userService.checkCredentialsHR(username, passward);
    	if(result == true) {
    		return true;
    	}
    	return false;
    }
	
    // creating user by taking input from scanner class.
	public void createUser() {
		//User user = new User();
		User user = new User();
		System.out.println(" Enter name --> ");
		String name = sc.next();
		user.setName(name);
		
		System.out.println(" Enter username/email --> ");
		String username = sc.next();
		user.setUsername(username);
		
		System.out.println(" Enter passward --> ");
		String passward = sc.next();
		user.setPassward(passward);
		
		// setting by- default role of employee -->
//		Role role = new Role(2, "EMPLOYEE");
//		Set<Role> roles = new HashSet<>();
//		roles.add(role);
//		user.setRoles(roles);
		
		// saving the user in database 
	 User createdUser = userService.createUser(user);
	 System.out.println(createdUser);
	  
	}
	
	// getting all users 
	public void getAllUsers(){
		List<User> allUsers = this.userService.getAllUsers();
		for(User user : allUsers) {
			System.out.println(user);	
		}
		
	}
	
	// updating user
	public void updateUser() {
		System.out.println(" Enter the user-id whom to update ! ");
		Integer userId = sc.nextInt();
		if(this.userRepository.findById(userId) == null) {
			System.out.println(" No User found with this user-id : "+userId);
		}
		else {
		User user = new User();
		System.out.println(" Enter the updated name --> ");
		String name = sc.next();
		user.setName(name);
		
		System.out.println(" Enter the updated username --> ");
		String username = sc.next();
		user.setUsername(username);
		
		System.out.println(" Enter the updated passward --> ");
		String passward = sc.next();
		user.setPassward(passward);
		try {
			User updatedUser = this.userService.updateUser(user, userId);
			System.out.println(updatedUser);	
		} catch (ResourceNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		}
	}
	
	// deleting user -->
	public void deleteUser() {
		System.out.println("Enter the user-id whom to delete --> ");
		Integer userId = sc.nextInt();
		if(this.userRepository.findById(userId) == null) {
			System.out.println("No user found with this user-id : "+userId);
		}
		else {

		try {
			this.userService.deleteUser(userId);
			System.out.println("User has been deleted successfully ");
			
		} catch (ResourceNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		}
		
	}
}
