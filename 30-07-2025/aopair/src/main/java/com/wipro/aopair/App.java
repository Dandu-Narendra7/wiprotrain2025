package com.wipro.aopair;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import  com.wipro.aopair.exception. NoSeatAvailableException;
import com.wipro.aopair.aspect.AirTravelAspect;
import com.wipro.aopair.services.AirTravelProcess;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
    	ctx.scan("com.wipro.aopair.*");
    	ctx.refresh();
    	AirTravelProcess airTravelProcess=ctx.getBean(AirTravelProcess.class);
    	try {
    	
    			airTravelProcess.checkIn(true);
    			airTravelProcess.collectBoardingPass();
    			airTravelProcess.doSecurityCheck();
    			airTravelProcess.doBoarding();
    	}
    			catch (NoSeatAvailableException message){
    				System.out.println("contact the manger");
    				
    			}
    	
       
}
}
