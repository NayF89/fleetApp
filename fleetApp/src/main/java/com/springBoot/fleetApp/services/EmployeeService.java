package com.springBoot.fleetApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.fleetApp.model.Employee;
import com.springBoot.fleetApp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
		
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	
	//Add Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	

}
