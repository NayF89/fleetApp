package com.springBoot.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.fleetApp.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
