package com.tcs.MamathaApplication.controller;

import com.tcs.MamathaApplication.entity.Employee;
import com.tcs.MamathaApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/saveDetails")
    public Employee saveEmployee(@RequestBody Employee employee){
       return employeeService.saveEmpDetails(employee);
    }
    @GetMapping("/getDetails")
    public List<Employee> getDetails(){
        return employeeService.getEmpDetails();
    }
    @DeleteMapping("/deleteEmp/{id}")
    public void deleteEmp(@PathVariable("id") int eid){
        employeeService.deleteEmp(eid);
    }
    @PutMapping("/updateEmp/{id}")
    public Employee updateEmp(@RequestBody Employee employee,@PathVariable("id") int eid){
        return employeeService.updateEmp(employee,eid);
    }
}
