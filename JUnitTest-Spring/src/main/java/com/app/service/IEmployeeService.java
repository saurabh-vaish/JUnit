package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeService {

	
	public Integer saveEmployee(Employee e);
	public Employee getEmployee(Integer id);
	public List<Employee> getAll();
	public Integer deleteEmployee(Integer id);
	
	
}
