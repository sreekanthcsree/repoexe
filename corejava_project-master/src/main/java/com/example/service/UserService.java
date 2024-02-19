package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	// check credentials for ADMIN -->
	public boolean checkCredentialsADMIN(String username, String passward) {
		User user = this.userRepository.findByUsernameAndPassward(username, passward);  
		if(user != null) {
			Role role = new Role(1, "ADMIN");
			boolean type = user.getRoles().contains(role);
			if(type == true) {
				return true;
			}
		}
		return false;
	}
	
	// check credentials for EMPLOYEE -->
		public boolean checkCredentialsEMP(String username, String passward) {
			User user = this.userRepository.findByUsernameAndPassward(username, passward); 
			if(user != null) {
				Role role = new Role(2, "EMPLOYEE");
				boolean type = user.getRoles().contains(role);
				if(type == true) {
					return true;
				}
			}
			return false;
		}
		
		// check credentials for HR -->
		public boolean checkCredentialsHR(String username, String passward) {
			User user = this.userRepository.findByUsernameAndPassward(username, passward);
			if(user != null) {
				Role role = new Role(3, "HR");
				boolean type = user.getRoles().contains(role);
				if(type == true) {
					return true;
				}
			}
			return false;
		}

	// create user 
	public User createUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}
//	 get all users 
	public List<User> getAllUsers(){
		List<User> users = this.userRepository.findAll();
		return users;
	}
	
	// update user -->
	public User updateUser(User user, Integer userId) {
		User user2 = this.userRepository.findById(userId).orElseThrow(() ->
		new ResourceNotFoundException("User not found with user-id : "+ userId));
		user2.setName(user.getName());
		
		User updatedUser = this.userRepository.save(user2);
		return updatedUser;
	}
	
//	 delete user -->
	public void deleteUser(Integer userId) {
		User user = this.userRepository.findById(userId).orElseThrow(() ->
		new ResourceNotFoundException("User Not found with user-id : "+userId));
		this.userRepository.delete(user);
	}
}
