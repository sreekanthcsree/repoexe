package com.dextris.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dextris.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
