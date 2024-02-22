package com.dextris.service;

import com.dextris.controller.PersonController;
import com.dextris.entity.Employee;
import com.dextris.model.RegisterBean;
import com.dextris.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class PersonService {

    @Autowired
    private EmployeeRepo employeeRepo;
    public void save(RegisterBean bean) {

      Employee emp =  Employee.builder()
                .emp_id(bean.getPersonId())
                .emp_name((bean.getPersonName()))
                .password(bean.getPassword())
                .designation(bean.getDesignation())
                .email(bean.getEmail())
                .mobileNo(bean.getMobileNo())
                .dob(bean.getDob()).build();
      employeeRepo.save(emp);
    }
    public void isExist(RegisterBean beanOne){

    }

    public void getLogin(RegisterBean bean) {
        Employee employee = Employee.builder()
                .emp_id(bean.getPersonId())
                .emp_name(bean.getPersonName()).build();
        employeeRepo.getById(employee);
    }

}
