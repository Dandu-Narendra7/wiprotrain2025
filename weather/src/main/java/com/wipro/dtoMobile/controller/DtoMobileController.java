package com.wipro.dtoMobile.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dtoMobile.dtoMobile;

@RestController

public class DtoMobileController {
	@PostMapping("/Mobile")
	 public String receiveMobileData(@RequestBody dtoMobile mobile) {
        // Print to console
        System.out.println("Received mobile data: " + mobile);
        return "Mobile data received successfully!";
	}
        @PutMapping("/modelNumber")
        public String updatemodelNumber(@RequestBody dtoMobile mobile) {
			return updatemodelNumber(null);
        	
        }
        
        
        


}
