package com.springBoot.fleetApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.springBoot.fleetApp.model.EmployeeType;
import com.springBoot.fleetApp.services.EmployeeTypeService;

@Controller
public class EmployeeTypeController {
	
	@Autowired private EmployeeTypeService employeeTypeService;
	
	//Get All EmployeeTypes
	@GetMapping("employeeTypes")
	public String findAll(Model model){		
		model.addAttribute("employeeTypes", employeeTypeService.findAll());
		return "employeeType";
	}	
	
	//Add EmployeeType
	@PostMapping(value="employeeTypes/addNew")
	public String addNew(EmployeeType employeeType) {
		employeeTypeService.save(employeeType);
		return "redirect:/employeeTypes";
	}	

}
