package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	
       
	Alpha alp1=ap.getBean("alpha1",Alpha.class);
	alp1.funAlpha();
	
	System.out.println("--------------------------------------");
	
	alp1.setName("Ram");
	alp1.funAlpha();
	
	
	
}
}
