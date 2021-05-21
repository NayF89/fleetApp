package com.springBoot.fleetApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.fleetApp.model.State;
import com.springBoot.fleetApp.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	//Get All States
	public List<State> findAll(){
		return stateRepository.findAll();
	}	
	//Add State
	public void save( State state) {
		stateRepository.save(state);
	}
}
