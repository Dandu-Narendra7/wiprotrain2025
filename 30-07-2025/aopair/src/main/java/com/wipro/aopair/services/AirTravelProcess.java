package com.wipro.aopair.services;

import com.wipro.aopair.exception.NoSeatAvailableException;

public class AirTravelProcess {
	
	 public static Object doSecurityCheck;

	public static void checkIn(boolean flag) throws NoSeatAvailableException {
	        if (flag) {
	            System.out.println("Check-in successful.");
	        } else {
	            throw new NoSeatAvailableException("No seat available.");
	        }
	    }

	    public static void collectBoardingPass() {
	        System.out.println("Boarding pass collected successfully");
	    }

	    public static void doSecurityCheck() {
	        System.out.println("Security check done successfully");
	    }

	    public static void doBoarding() {
	        System.out.println("Boarding completed successfully");
	    }


}
