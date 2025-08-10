package com.wipro.car.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.car.entity.*;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
