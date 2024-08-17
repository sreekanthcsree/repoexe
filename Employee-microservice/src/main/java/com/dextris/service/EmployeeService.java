package com.dextris.service;

import com.dextris.entity.Employee;
import com.dextris.payload.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmpById(long id);

}
