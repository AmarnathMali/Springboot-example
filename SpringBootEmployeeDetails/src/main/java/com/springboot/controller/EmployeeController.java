package com.springboot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("employees/action")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	
	
	
}
