package com.wipro.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemo.beans.Depatment;


public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
        Depatment dep=  ctx.getBean(Depatment.class);
    	dep.setDeptCode("ece");
    	dep.setDepartmentName("Electronics");
    	System.out.println(dep);
    }
}
