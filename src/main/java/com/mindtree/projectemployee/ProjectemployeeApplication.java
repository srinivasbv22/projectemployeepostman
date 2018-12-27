package com.mindtree.projectemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mindtree.projectemployee")

@SpringBootApplication
public class ProjectemployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectemployeeApplication.class, args);
	}

}

