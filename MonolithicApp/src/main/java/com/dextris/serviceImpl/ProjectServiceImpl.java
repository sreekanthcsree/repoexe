package com.dextris.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dextris.entity.Project;
import com.dextris.repo.ProjectRepo;
import com.dextris.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepo projectRepo;

	@Override
	public Project saveProject(Project project) {
	    Project savepro = projectRepo.save(project);
		return savepro;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project foundProject = projectRepo.findByProjectCode(projectCode);
		return foundProject;
	}

	
}
