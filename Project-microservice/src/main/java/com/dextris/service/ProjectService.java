package com.dextris.service;

import com.dextris.entity.Project;

public interface ProjectService {
	
	public Project saveProject(Project project);
	public Project getProjectByCode(long projectCode);

}
