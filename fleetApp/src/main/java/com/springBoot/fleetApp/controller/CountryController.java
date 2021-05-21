package com.springBoot.fleetApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springBoot.fleetApp.model.Country;
import com.springBoot.fleetApp.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired private CountryService countryService;
	
	//Get All Countrys
	@GetMapping("countries")
	public String findAll(Model model){		
		model.addAttribute("countries", countryService.findAll());
		return "country";
	}	
	
	//Add Country
	@PostMapping(value="countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}	
}
