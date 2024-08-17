package com.dextris.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dextris.entity.Employee;
import com.dextris.entity.Project;
import com.dextris.payload.EmployeeDto;
import com.dextris.repo.EmployeeRepo;
import com.dextris.repo.ProjectRepo;
import com.dextris.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private ProjectRepo projectRepo;

	@Override
	public EmployeeDto saveEmployee(Employee employee) {
	   Employee saveEmp = employeeRepo.save(employee);
	   Project project = projectRepo.findByProjectCode(saveEmp.getEmployeeAssignedProject());
	   EmployeeDto empDto = new EmployeeDto();
	   empDto.setId(saveEmp.getId());
	   empDto.setEmployeeName(saveEmp.getEmployeeName());
	   empDto.setEmployeeEmail(saveEmp.getEmployeeEmail());
	   empDto.setEmployeeBaseLocation(saveEmp.getEmployeeBaseLocation());
	   empDto.setProjectCode(project.getProjectCode());
	   empDto.setProjectName(project.getProjectName());
		return empDto;
	}

	@Override
	public EmployeeDto getEmpById(long id) {
		
	    Employee foundEmp = employeeRepo.findById(id).get();
		Project project = projectRepo.findByProjectCode(foundEmp.getEmployeeAssignedProject());
		EmployeeDto empDto = new EmployeeDto();
		empDto.setId(foundEmp.getId());
		empDto.setEmployeeName(foundEmp.getEmployeeName());
	    empDto.setEmployeeEmail(foundEmp.getEmployeeEmail());
		empDto.setEmployeeBaseLocation(foundEmp.getEmployeeBaseLocation());
		empDto.setProjectCode(project.getProjectCode());
		empDto.setProjectName(project.getProjectName());
		 return empDto;

	}

	
}
