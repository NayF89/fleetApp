package com.springBoot.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.fleetApp.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
