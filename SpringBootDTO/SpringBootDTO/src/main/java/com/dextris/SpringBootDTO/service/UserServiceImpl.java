package com.dextris.SpringBootDTO.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dextris.SpringBootDTO.dto.UserDto;
import com.dextris.SpringBootDTO.entity.User;
import com.dextris.SpringBootDTO.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepo repo;
	private final ModelMapper mapper;
	
	@Autowired
	public UserServiceImpl(UserRepo repo,ModelMapper mapper) {
		this.repo=repo;
		this.mapper=mapper;
	}

	@Override
	public UserDto createUser(UserDto userDTO) {
		// TODO Auto-generated method stub
		User user = convertToEntity(userDTO);
        user = repo.save(user);
        return convertToDTO(user);
	}

    private UserDto convertToDTO(User user) {
        return mapper.map(user, UserDto.class);
    }

    private User convertToEntity(UserDto userDto) {
        return mapper.map(userDto, User.class);
    }

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	
}
