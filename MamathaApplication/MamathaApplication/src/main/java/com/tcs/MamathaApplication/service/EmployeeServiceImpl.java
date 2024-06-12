package com.tcs.MamathaApplication.service;

import com.tcs.MamathaApplication.entity.Employee;
import com.tcs.MamathaApplication.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    public EmployeeRepo employeeRepo;
    @Override
    public Employee saveEmpDetails(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmpDetails() {
        return employeeRepo.findAll();
    }

    @Override
    public void deleteEmp(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public Employee updateEmp(Employee employee, int eid) {
         Employee emp = employeeRepo.findById(eid).get();

        if(Objects.nonNull(employee.getEname()) && !"".equalsIgnoreCase(employee.getEname())){
            emp.setEname(employee.getEname());
        }
        if(Objects.nonNull(employee.getEmail()) && !"".equalsIgnoreCase(employee.getEmail())){
            emp.setEmail(employee.getEmail());
        }
        if(Objects.nonNull(employee.getMobileNo()) && !"".equalsIgnoreCase(employee.getMobileNo())){
            emp.setMobileNo(employee.getMobileNo());
        }
        if(Objects.nonNull(employee.getGender()) && !"".equalsIgnoreCase(employee.getGender())){
            emp.setGender(employee.getGender());
        }
        if(Objects.nonNull(employee.getSalary()) && !"".equalsIgnoreCase(employee.getSalary())){
            emp.setSalary(employee.getSalary());
        }


        return employeeRepo.save(emp);
    }

}
