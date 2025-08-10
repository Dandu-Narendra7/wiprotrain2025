package com.wipro.aopair.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import com.wipro.aopair.exception.*;

@Aspect
public class AirTravelAspect {

    @Before("execution(* AirTravelProcess.checkIn(..))")
    public void showPhotoId() {
        System.out.println("Show Photo ID before check-in");
    }

    @Before("execution(* AirTravelProcess.doSecurityCheck(..)) || execution(* AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println("Show Boarding Pass before Security Check or Boarding");
    }

    @AfterThrowing(pointcut = "execution(* AirTravelProcess.checkIn(..))", throwing = "ex")
    public void handleNoSeatAvailable(NoSeatAvailableException ex) {
        System.out.println("contact with the manger " + ex.getMessage());
    }
}
