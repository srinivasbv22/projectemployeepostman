package com.mindtree.projectemployee.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.projectemployee.entity.Project;
import com.mindtree.projectemployee.repoitory.ProjectRepository;
import com.mindtree.projectemployee.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private  ProjectRepository projectRepository;

	@Override
	public String addProject(Project project) {
		projectRepository.save(project);
		return "Success";
	}

	@Override
	public Optional<Project> getByProjectId(int projectId) {
		return projectRepository.findById(projectId);
	}

	@Override
	public List<Project> allProject() {
		List<Project> l = new ArrayList<Project>();
		projectRepository.findAll().forEach(e-> {l.add(e);});
		return l;
	}

	@Override
	public String updateProject(Project project) {
		projectRepository.save(project);
		return "Success";
	}

	@Override
	public String deleteProject(int projectId) {
		projectRepository.deleteById(projectId);
		return "Success";
	}
	
	
}
