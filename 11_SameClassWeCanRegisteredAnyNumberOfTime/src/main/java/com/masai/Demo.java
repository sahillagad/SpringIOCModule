package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Travel travel=context.getBean("id1",Travel.class);
		travel.funTravel();
		
		System.out.println("--------------------------------------------");
		
		Travel travel1=context.getBean("id2",Travel.class);
		travel1.funTravel();
		
		
		
		
		
	}
}
