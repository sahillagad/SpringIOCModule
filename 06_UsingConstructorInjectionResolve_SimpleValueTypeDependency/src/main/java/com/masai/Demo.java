package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
 
	public static void main(String[] args) {
		
//		Activate Spring Container Container
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 // Automatically Downcast because we write Class Name
		 //pulling the Spring Bean Object With  help Of Id which We Give At the time Of registered Spring Container
		 MyBusinessClass businessClass= context.getBean("id1",MyBusinessClass.class);
		 businessClass.funA();
		 
		
		 
		
		
		
	}
	
}
