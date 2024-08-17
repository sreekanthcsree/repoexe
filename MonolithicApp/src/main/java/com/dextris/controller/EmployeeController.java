package com.dextris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.entity.Employee;
import com.dextris.payload.EmployeeDto;
import com.dextris.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmp")
	public EmployeeDto createEmp(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	@GetMapping("/emp/{emp_id}")
	public EmployeeDto getEmp(@PathVariable("emp_id") long id) {
		return employeeService.getEmpById(id);
		
	}

}
