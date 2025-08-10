package mvcexample.services;
import java.util.List;

import carrepo.Car;

public class CarService {
	 Car carRepo = new Car();

    public List<String> fetchCarList() {
        return carRepo.getAllCars();
    }

}
