package com.emp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
