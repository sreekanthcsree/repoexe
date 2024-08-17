package com.example.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	public DepartmentRepo departmentRepo;

	@Override
	public Department saveDeptDetails(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> getDeptInfo() {
		return departmentRepo.findAll();
	}

	@Override
	public void delete(Long id) {
       departmentRepo.deleteById(id);		
	}

	@Override
	public Optional<Department> getDeptById(Long dId) {
		return departmentRepo.findById(dId);
	}

	@Override
	public Department updateDept(Department department, Long id) {
		Department department2 = departmentRepo.findById(id).get();
		
		if(Objects.nonNull(department.getdName()) && !"".equalsIgnoreCase(department.getdName())) {
			department2.setdName(department.getdName());
		}
		if(Objects.nonNull(department.getdAddress()) && !"".equalsIgnoreCase(department.getdAddress())) {
			department2.setdAddress(department.getdAddress());
		}
		if(Objects.nonNull(department.getdCode()) && !"".equalsIgnoreCase(department.getdCode())) {
			department2.setdCode(department.getdCode());
		}
		
		return departmentRepo.save(department2);
	}

	
	
}
