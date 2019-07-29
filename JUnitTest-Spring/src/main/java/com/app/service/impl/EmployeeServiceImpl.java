package com.app.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.service.IEmployeeService;


@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public Integer saveEmployee(Employee e) {
		return e.getEmpId();
	}

	@Override
	public Employee getEmployee(Integer id) {
		return new Employee(10,"AA",2.3);
	}

	@Override
	public List<Employee> getAll() {
		return Arrays.asList(	new Employee(10,"AA",2.3),
								new Employee(11,"AB",3.3),
								new Employee(12,"AC",4.3)
							);
	}

	@Override
	public Integer deleteEmployee(Integer id) {
		return id;
	}

	

}
