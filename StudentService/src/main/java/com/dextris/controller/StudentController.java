package com.dextris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.entity.Student;
import com.dextris.service.StudentService;
import com.dextris.vo.StudentDepartmentVO;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveData")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@GetMapping("/getData/{id}")
	public StudentDepartmentVO getStudentWithDept(@PathVariable Long id) {
		return studentService.getStudentWithDepartment(id);
	}

}
