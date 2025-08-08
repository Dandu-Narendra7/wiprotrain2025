package com.wipro.CarEx2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.CarEx2.repo.Vehiclerepo;
import com.wipro.car.entity.Car;
import com.wipro.car.repo.CarRepository;

public class CarService {
	@Autowired
	Vehiclerepo vehiclerepo;
	 public List<Car> getAllCars() {
	        return vehiclerepo.findAll();
	    }

	   

	    public Car createCar(Car car) {
	        return vehiclerepo.save(car);
	    }


}
