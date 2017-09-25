package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Employee;

@Transactional
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
	
	
	public Employee findByEmployeeName(String name);
	
}
