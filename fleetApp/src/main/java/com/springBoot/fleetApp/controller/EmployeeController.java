package com.springBoot.fleetApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springBoot.fleetApp.model.Employee;
import com.springBoot.fleetApp.services.CountryService;
import com.springBoot.fleetApp.services.EmployeeService;
import com.springBoot.fleetApp.services.EmployeeTypeService;
import com.springBoot.fleetApp.services.JobTitleService;
import com.springBoot.fleetApp.services.StateService;

@Controller
public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	@Autowired private StateService stateService;
	
	@Autowired private JobTitleService jobTitleService;
	
	@Autowired private EmployeeTypeService employeeTypeService;
	@Autowired private CountryService countryService;
	
	//Get All Employees
	@GetMapping(value="employees")
	public String findAll(Model model){
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("employees", employeeService.findAll());
		model.addAttribute("jobTitles", jobTitleService.findAll());
		model.addAttribute("employeeTypes", employeeTypeService.findAll());
		
		return "employee";
	}	
	
	//Add Employee
	@PostMapping(value="employees/addNew")
	public String addNew(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}	
	
	
}
