package com.dextris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.entity.Department;
import com.dextris.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDeptDetails")
	public Department saveDept(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/get/{id}")
	public Department getDept(@PathVariable Long id) {
		return departmentService.getByDepartments(id);
	}

}
