package mvcexample.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvcexample.services.CarService;

import java.util.List;
@Controller
@RequestMapping("/car")

public class CarController {
	@Autowired
	CarService carService;
	@GetMapping("/list")
	public String showCarList(Model m) {
        List<String> cars = carService.fetchCarList();
        m.addAttribute("carList", cars);
        return "carlist"; 
	}
	}




