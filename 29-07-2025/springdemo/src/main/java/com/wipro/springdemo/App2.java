package com.wipro.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemo.beans.Depatment;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ev= new ClassPathXmlApplicationContext("beans.xml");
		Depatment department =ev.getBean(Depatment.class);
		System.out.println(department);

	}

}
