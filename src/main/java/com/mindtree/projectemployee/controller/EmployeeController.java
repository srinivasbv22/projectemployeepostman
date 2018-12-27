package com.mindtree.projectemployee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.projectemployee.entity.Employee;
import com.mindtree.projectemployee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable("employeeId") int employeeId)
	{
		return employeeService.getByEmployeeId(employeeId);
	}
	
	@RequestMapping("/employees")
	public List<Employee> getAllTopics() {
		return employeeService.allEmployees();
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employee")
	public void updateEmployee(@RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employee/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
	}

}
