package com.dextris.SpringBootDTO.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dextris.SpringBootDTO.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
