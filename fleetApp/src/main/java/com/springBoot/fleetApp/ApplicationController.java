package com.springBoot.fleetApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Runs the Bootstrapt template
@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String goHome() {
		return "Index";
	}

}
