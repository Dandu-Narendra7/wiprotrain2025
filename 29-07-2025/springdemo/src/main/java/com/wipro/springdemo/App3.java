package com.wipro.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.springdemo.beans.Mobile;

public class App3 {
	ApplicationContext context = new AnnotationConfigApplicationContext();
	 Mobile mob = context.getBean(Mobile.class);   
 }
	


