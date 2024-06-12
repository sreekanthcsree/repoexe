package com.dextris.SpringBootDTO.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dextris.SpringBootDTO.dto.UserDto;
import com.dextris.SpringBootDTO.entity.User;


public interface UserService {
	
	//List<UserDto> getAllUsers();
  //  UserDto getUserById(int id);
  //  UserDto updateUser(int id, UserDto userDTO);
    void deleteUser(int id);
	UserDto createUser(UserDto userDTO);
}
