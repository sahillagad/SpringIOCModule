package com.masai.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.Persentation.PrersentationBean;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PrersentationBean bean=context.getBean("PBObj",PrersentationBean.class);
		bean.present();
		
		
		
		
	}

}
