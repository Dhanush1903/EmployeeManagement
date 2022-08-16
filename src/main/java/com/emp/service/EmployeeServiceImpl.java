package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl  implements IEmployeeService{
	@Autowired
	IEmployeeRepository employeeRepository;

	@Override
	public Integer saveEmployee(Employee employee) {
	Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee.getId();
	}

	@Override
	public List<Employee> getallEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	

}
