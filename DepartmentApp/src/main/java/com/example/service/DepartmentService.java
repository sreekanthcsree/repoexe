package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Department;

public interface DepartmentService {

	public Department saveDeptDetails(Department department);
	public List<Department> getDeptInfo();
	public Optional<Department> getDeptById(Long dId);
	public void delete(Long id);
	public Department updateDept(Department department,Long id);

}
