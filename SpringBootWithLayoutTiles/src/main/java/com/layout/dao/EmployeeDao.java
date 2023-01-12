package com.layout.dao;

import org.springframework.data.repository.CrudRepository;

import com.layout.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
