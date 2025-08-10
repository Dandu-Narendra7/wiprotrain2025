package com.wipro.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.car.entity.Car;
import com.wipro.car.repo.CarRepository;

@Service
public class CarService {
	 @Autowired
	  CarRepository carRepository;

	    public List<Car> getAllCars() {
	        return carRepository.findAll();
	    }

	    public Car getCarById(int id) {
	        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
	    }

	    public Car createCar(Car car) {
	        return carRepository.save(car);
	    }

	    public Car updateCar(int id, Car updatedCar) {
	        Car existingCar = getCarById(id);
	        existingCar.setMake(updatedCar.getMake());
	        existingCar.setRegistrationDetail(updatedCar.getRegistrationDetail());
	        return carRepository.save(existingCar);
	    }

	    public void deleteCar(int id) {
	        carRepository.deleteById(id);
	    }


}
