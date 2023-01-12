package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
 
	public static void main(String[] args) {
		
//		Activate Spring Container Container
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 Object obj= context.getBean("id1");
		 MyBusinessClass businessClass=(MyBusinessClass)obj;
		
		 
		 businessClass.funA();
		 
		
		
		
		
	}
	
}
