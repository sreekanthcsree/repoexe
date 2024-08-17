package com.dextris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dextris.entity.Project;
import com.dextris.repo.ProjectRepo;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectRepo projectRepo;
	
	@PostMapping("/saveProject")
	public Project createProject(@RequestBody Project project) {
		return projectRepo.save(project);
	}
	@GetMapping("/code/{pro_code}")
	public Project getByPro(@PathVariable("pro_code") long projectCode) {
		return projectRepo.findByProjectCode(projectCode);
	}

}
