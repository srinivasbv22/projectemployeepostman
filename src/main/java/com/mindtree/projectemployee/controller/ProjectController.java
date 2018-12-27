package com.mindtree.projectemployee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.projectemployee.entity.Project;
import com.mindtree.projectemployee.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(method=RequestMethod.POST,value="/project")
	public void addProject(@RequestBody Project project)
	{
		projectService.addProject(project);
	}
	
	@RequestMapping("/project/{projectId}")
	public Optional<Project> getProject(@PathVariable("projectId") int projectId)
	{
		return projectService.getByProjectId(projectId);
	}
	
	@RequestMapping("/projects")
	public List<Project> getAllProjects() {
		return projectService.allProject();
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/project")
	public void updateProject(@RequestBody Project project)
	{
		projectService.updateProject(project);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/project/{projectId}")
	public void deleteProject(@PathVariable int projectId)
	{
		projectService.deleteProject(projectId);
	}
	
}
