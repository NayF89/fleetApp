package com.springBoot.fleetApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.springBoot.fleetApp.model.State;
import com.springBoot.fleetApp.services.CountryService;
import com.springBoot.fleetApp.services.StateService;

@Controller
public class StateController {
	
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	
	//Get All States
	@GetMapping(value="states")
	public String findAll(Model model){		
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("countries", countryService.findAll());
		return "state";
	}	
	
	//Add State
	@PostMapping(value="states/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/states";
	}	
}
