package com.dextris.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.entity.Student;
import com.dextris.repository.StudentRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	
	@GetMapping("/")
	public String hello() {
		return "Welcome to Bangalore...!";
	}
	
	  @PostMapping("/save")
	  public Student addDetails(@RequestBody Student student) { 
		  return repository.save(student);
	  }
	  
	  @GetMapping("/allDetails")
	  public List<Student> getDetails(){
		  return repository.findAll();
	  }
	  
	  @DeleteMapping("/delete/{id}")
	  public String delete(@PathVariable int id){
		  Student student = repository.findById(id).get();
		  if(student!=null) {
			  repository.delete(student);
		  }
		  return "Deleted Sucessfully...!";
	  }
	  
	  @PutMapping("/update")
	  public Student updateData(@RequestBody Student student) {
		return repository.save(student);
	  }
	  
	  @GetMapping("/getStudent/{id}")
	  public Student getSingleRecord(@PathVariable int id){
		  Optional<Student> student = repository.findById(id);
		  
		  Student student2=student.get();
		  return student2;
		 
		  }
	 

}
