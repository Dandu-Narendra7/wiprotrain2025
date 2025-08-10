package services;

import java.util.List;

public class CarService {
	 Car carRepo = new Car();

    public List<String> fetchCarList() {
        return carRepo.getAllCars();
    }

}
