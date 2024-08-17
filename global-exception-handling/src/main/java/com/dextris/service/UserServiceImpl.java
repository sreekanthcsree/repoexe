package com.dextris.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dextris.exception.UserNotFoundException;
import com.dextris.model.User;
import com.dextris.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Optional<List<User>> getAllUsers() {
		Optional<List<User>> allUsers = Optional.of(userRepository.findAll());
		if (allUsers.isPresent()) {
			return allUsers;
		}
		return Optional.empty();
	}

	@Override
	public Optional<User> createUser(User user) {
		return Optional.of(userRepository.findByEmail(user.getEmail()));
	}

	@Override
	public Optional<User> removeUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		user.ifPresent(u -> userRepository.delete(u));
		return user;
	}

	@Override
	public Optional<User> updateData(Long id, User user) {
		User existingUser = userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		userRepository.save(existingUser);

		return Optional.of(existingUser);
	}
}
