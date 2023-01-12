package com.masai.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.Persentation.PrersentationBean;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Here we A class Registered With TWO time Different Id
//		and we Use Autowrie  by type that reason it give Exception 
/*
   Unsatisfied dependency expressed through bean property 'a': 
   No qualifying bean of type 'com.masai.Persentation.A' available: expected single matching bean but found 2: aObj,a1
    Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException:
    Error creating bean with name 'PBObj' defined in class path resource [applicationContext.xml]:
    Unsatisfied dependency expressed through bean property 'a':  
    No qualifying bean of type 'com.masai.Persentation.A' available: expected single matching bean but found 2: aObj,a1
  
 */
		PrersentationBean bean=context.getBean("PBObj",PrersentationBean.class);
		bean.present();
		
		
		
		
	}

}
