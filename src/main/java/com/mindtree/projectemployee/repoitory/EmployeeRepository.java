package com.mindtree.projectemployee.repoitory;


import org.springframework.data.repository.CrudRepository;

import com.mindtree.projectemployee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
