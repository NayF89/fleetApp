package com.springBoot.fleetApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springBoot.fleetApp.model.JobTitle;
import com.springBoot.fleetApp.services.JobTitleService;

@Controller
public class JobTitleController {
	
	@Autowired private JobTitleService jobTitleService;
	
	//Get All JobTitles
	@GetMapping(value="jobTitles")
	public String findAll(Model model){		
		model.addAttribute("jobTitles", jobTitleService.findAll());
		return "jobTitle";
	}	
	
	//Add JobTitle
	@PostMapping(value="jobTitles/addNew")
	public String addNew(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobTitles";
	}	

}
