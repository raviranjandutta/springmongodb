package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService empService;
	
	
	@PostMapping(value="/api/v1/create")
	public ResponseEntity<Employee> createRecord(@RequestBody Employee emp){
		empService.create(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
}
 