package com.dextris.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.errors.ErrorDetails;
import com.dextris.exception.NoUsersFoundException;
import com.dextris.exception.UserCannotBeCreatedException;
import com.dextris.exception.UserNotFoundException;
import com.dextris.model.User;
import com.dextris.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/showAllUsers")
	public ResponseEntity<?> showAllUsers() {
		try {
			List<User> allUsers = userService.getAllUsers();
			return ResponseEntity.ok(allUsers);
		} catch (NoUsersFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		try {
			User createdUser = userService.createUser(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		} catch (UserCannotBeCreatedException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorDetails(LocalDateTime.now(),
					HttpStatus.BAD_REQUEST, "User Creation Failed", ex.getMessage()));
		}
	}

	@DeleteMapping("/removeUser/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
		Optional<User> removedUser = userService.removeUser(id);
		return removedUser.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<?> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		try {
			Optional<User> updatedUser = userService.updateData(id, user);
			return updatedUser.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
		} catch (UserNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ErrorDetails(LocalDateTime.now(), HttpStatus.NOT_FOUND, "User Not Found", ex.getMessage()));
		}
	}
}
