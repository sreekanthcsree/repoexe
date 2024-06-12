package com.dextris.service;

import com.dextris.entity.Employee;
import com.dextris.entity.Login;

public interface EmployeeService {
	
	int register(Employee employee);
    Employee validateEmp(Login login);
}
