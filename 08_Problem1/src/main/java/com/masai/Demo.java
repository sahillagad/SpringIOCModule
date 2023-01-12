package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Tourist tourist= context.getBean("tourist",Tourist.class);
		
		String result= tourist.toString();
		System.out.println(result);
		
	HolidayPackage holidayPackage=context.getBean("holidaypackage",HolidayPackage.class);
	holidayPackage.showDetails();
	
	
	}
}
