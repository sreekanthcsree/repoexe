package com.dextris.service;

import java.util.List;
import java.util.Optional;

import com.dextris.model.User;

public interface UserService {

	Optional<List<User>> getAllUsers();

	Optional<User> createUser(User user);

	public Optional<User> removeUser(Long id);
	
	public Optional<User> updateData(Long id,User user);

}
