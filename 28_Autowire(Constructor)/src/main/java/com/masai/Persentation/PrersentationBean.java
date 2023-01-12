package com.masai.Persentation;

import com.masai.Service.ServiceBean;

public class PrersentationBean {

	ServiceBean service;
   A  a;

public PrersentationBean(ServiceBean service, A a) {
	super();
	this.service = service;
	this.a = a;
}

public void present() {
	 
	 service.calculateInterest();
	 System.out.println("A address : "+a);
	 System.out.println("calculated Interest Presented in presentation class");
	 
 }
	
}
