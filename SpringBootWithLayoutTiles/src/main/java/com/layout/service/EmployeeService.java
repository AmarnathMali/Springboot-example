package com.layout.service;

import java.util.List;

import com.layout.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
	public List<Employee> listEmployee();
	public Employee getEmployeeById(int id);

}
