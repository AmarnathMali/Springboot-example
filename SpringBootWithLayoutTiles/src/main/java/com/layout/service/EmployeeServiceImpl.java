package com.layout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.layout.dao.EmployeeDao;
import com.layout.model.Employee;



@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly=true)
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.save(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.delete(emp);
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id).get();
	}

}
