package com.demo.service;

import com.demo.model.Employee;

public interface EmployeeService {
	
	void create(Employee employee);
	void update(Employee employee);
	void findEmployee(String id);
	void delete(String id);
;

}
