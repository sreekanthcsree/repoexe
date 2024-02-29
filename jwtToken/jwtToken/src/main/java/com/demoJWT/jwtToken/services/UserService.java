package com.demoJWT.jwtToken.services;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demoJWT.jwtToken.entities.UserData;
import com.demoJWT.jwtToken.repositories.JwtRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private JwtRepo jwtRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("hiiiiii");
		UserData userData=jwtRepo.findByUsername(username);
		if(userData==null)
		{
			throw new UsernameNotFoundException("uset not found");
		}
		return new User(userData.getUsername(),userData.getPassword(),new ArrayList<>());
	}

}
