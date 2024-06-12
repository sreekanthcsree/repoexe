package com.dextris.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dextris.dao.EmployeeDao;
import com.dextris.entity.Employee;
import com.dextris.entity.Login;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	public EmployeeDao employeeDao;

	@Override
	public int register(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.register();
	}

	@Override
	public Employee validateEmp(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
