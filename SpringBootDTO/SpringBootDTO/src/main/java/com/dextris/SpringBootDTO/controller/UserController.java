package com.dextris.SpringBootDTO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.SpringBootDTO.dto.UserDto;
import com.dextris.SpringBootDTO.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
     public final UserService userService;
	
     @Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@PostMapping
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto createdUser = userService.createUser(userDto);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

}

