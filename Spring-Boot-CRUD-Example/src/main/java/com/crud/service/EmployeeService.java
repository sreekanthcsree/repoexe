package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee createEmp(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmp(){
	    return employeeRepo.findAll();
	}
	
    public Optional<Employee> getByEmpId(Long id) {
		return employeeRepo.findById(id);
	}

	public void deleteById(Long id) {
		Employee employee = employeeRepo.findById(id).orElseThrow(()->new RuntimeException("Employee not found...!"));
         employeeRepo.delete(employee);
	}
	public Employee updateEmp(Long id,Employee employeeEmp) {
	   Employee emp = employeeRepo.findById(id).orElseThrow(()->new RuntimeException("Employee not found...!"));
	   emp.setName(employeeEmp.getName());
	   emp.setRole(employeeEmp.getRole());
	   emp.setSalary(employeeEmp.getSalary());
	   return employeeRepo.save(emp);
	}
}
