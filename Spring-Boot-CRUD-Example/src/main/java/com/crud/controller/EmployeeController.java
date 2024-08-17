package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmp")
	public Employee createEmployees(@RequestBody Employee employee) {
		return employeeService.createEmp(employee);
	}
	@GetMapping("/getAllEmp")	
	public List<Employee> getAllEmpEx(){
		return employeeService.getAllEmp();
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employee> GetByEmplId(@PathVariable("id") Long id){
	  Employee employee =	employeeService.getByEmpId(id).orElseThrow(()->new RuntimeException("Employee not found...!"));
	  return ResponseEntity.ok(employee);
	}
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<Employee> deleteByEmpId(@PathVariable("id") Long id){
	 employeeService.deleteById(id);
	 return ResponseEntity.noContent().build();
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmpDetails(@PathVariable Long id,@RequestBody Employee empDetails){
	  Employee emp = employeeService.updateEmp(id, empDetails);
	  return ResponseEntity.ok(emp);
       
    
    }
}
