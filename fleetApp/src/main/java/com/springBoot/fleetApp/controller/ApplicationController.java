package com.springBoot.fleetApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Runs the Bootstrapt template
@Controller
public class ApplicationController {
	
	@GetMapping(value="/index")
	public String goHome() {
		return "Index";
	}

}
