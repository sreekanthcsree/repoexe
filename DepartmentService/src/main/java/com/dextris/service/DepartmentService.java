package com.dextris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dextris.entity.Department;
import com.dextris.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}
	public Department getByDepartments(Long id) {
		return departmentRepo.findById(id).get();
	}

}
