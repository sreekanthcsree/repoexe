package com.dextris.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dextris.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long>{
	
	Project findByProjectCode(long empAssignedProject);

}
