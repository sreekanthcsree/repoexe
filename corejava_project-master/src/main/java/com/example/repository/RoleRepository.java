package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	//public Role findByRole_name(String role_name);
}
