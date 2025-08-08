package com.wipro.CarEx2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.CarEx2.dto.CarMovement;
import com.wipro.CarEx2.repo.Vehiclerepo;
import com.wipro.car.service.CarService;


public class MovementController {
	 @Autowired
	 CarService carservice;
	 @PostMapping
	    public void saveMovement(@RequestBody CarMovement request) {
		 CarService.saveMovement(request);
	    }

	    @GetMapping
	    public List<VehicleMovement> getAllMovements() {
	        return movementService.getAllMovements();
	    }

	

}
