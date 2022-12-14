package com.emp.service;

import java.util.List;
import java.util.Optional;

import com.emp.entity.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee employee);
	
	public List<Employee> getallEmployees();
	
	public Optional<Employee> getEmployee(Integer id);
	
	public void deleteEmployee(Integer id);
	
	public void deleteallEmployees();
	
	Employee updateEmployee(Employee employee, Integer id);
}
