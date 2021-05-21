package com.springBoot.fleetApp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.fleetApp.model.Country;
import com.springBoot.fleetApp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Return all country data from the database table
	public List<Country> findAll(){
		return countryRepository.findAll();
	}	
	
	//Update Country
	public void save(Country country) {
		countryRepository.save(country);
	}

}
