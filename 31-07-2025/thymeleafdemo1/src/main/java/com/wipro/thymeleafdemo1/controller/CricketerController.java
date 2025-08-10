package com.wipro.thymeleafdemo1.controller;

public class CricketerController {
	 @GetMapping("/cricketers")
	    public String showCricketers(Model model) {
	        List<Cricketer> cricketers = List.of(
	            new Cricketer("Virat Kohli", "Batsman"),
	            new Cricketer("Jasprit Bumrah", "Bowler"),
	            new Cricketer("Ravindra Jadeja", "All-Rounder")
	        );
	        model.addAttribute("cricketers", cricketers);
	        return "cricketers"; // Thymeleaf template name
	    }


}
