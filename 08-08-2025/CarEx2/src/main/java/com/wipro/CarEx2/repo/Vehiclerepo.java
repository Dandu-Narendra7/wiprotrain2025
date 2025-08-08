package com.wipro.CarEx2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.CarEx2.dto.CarMovement;

public interface Vehiclerepo extends JpaRepository<CarMovement, Integer> {
	
}

