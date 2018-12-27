package com.mindtree.projectemployee.repoitory;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.projectemployee.entity.Project;

public interface ProjectRepository extends CrudRepository<Project,Integer> {

}
