package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public void create(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public void update(Employee employee) {
		

	}

	@Override
	public void findEmployee(String id) {
		Employee emp = employeeRepo.findOne(Long.valueOf(id));
		
	

	}

	@Override
	public void delete(String id) {
		employeeRepo.delete(Long.valueOf(id));

	}

}
