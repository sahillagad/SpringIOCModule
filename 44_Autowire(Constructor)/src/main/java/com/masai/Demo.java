package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Alpha alpha= context.getBean("alpha",Alpha.class);
		
	  alpha.start(); 	
	
		
		
		
	}
}
