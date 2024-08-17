package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/addDepts")
	public Department saveDept(@RequestBody Department department) {
		return departmentService.saveDeptDetails(department);
	}
	@GetMapping("/getDetails")
	public List<Department> getDeptDetails(){
		return departmentService.getDeptInfo();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDeptById(@PathVariable("id") Long id) {
		departmentService.delete(id);
		return "delete the dept id";
	}
	@GetMapping("/basedOnId/{dId}")
	public Optional<Department> fetchById(@PathVariable Long dId) {
		return departmentService.getDeptById(dId);
	}
    @PutMapping("/update/{id}")	
	public Department updateDeptById(@RequestBody Department department,@PathVariable Long id) {
         return departmentService.updateDept(department, id);
	}

}
