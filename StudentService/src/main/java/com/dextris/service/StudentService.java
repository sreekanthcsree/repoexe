package com.dextris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dextris.entity.Student;
import com.dextris.repo.StudentRepo;
import com.dextris.vo.Department;
import com.dextris.vo.StudentDepartmentVO;

@Service
public class StudentService {
	
	private String baseUrl = "http://localhost:1001/get/";
	
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private RestTemplate restTemplate;
	
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	public StudentDepartmentVO getStudentWithDepartment(Long id) {
	     Student student = studentRepo.findById(id).get();
	     Department department = restTemplate.getForObject(baseUrl+student.getDepartmentId(), Department.class);
	     StudentDepartmentVO vo = new StudentDepartmentVO();
	     vo.setDepartment(department);
	     vo.setStudent(student);
	     return vo;
	
	}

	
}
