package com.demoJWT.jwtToken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoJWT.jwtToken.entities.UserData;

public interface JwtRepo extends JpaRepository<UserData,Integer>{

	UserData findByUsername(String username);
}
