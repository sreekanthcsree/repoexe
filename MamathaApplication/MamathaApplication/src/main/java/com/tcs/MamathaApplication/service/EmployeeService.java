package com.tcs.MamathaApplication.service;

import com.tcs.MamathaApplication.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    //to save the employee data
    public Employee saveEmpDetails(Employee employee);
    public List<Employee> getEmpDetails();
    public void deleteEmp(int id);
    public Employee updateEmp(Employee employee, int eid);
}
