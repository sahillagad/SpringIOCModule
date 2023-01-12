package com.masai.Persentation;

import com.masai.Service.ServiceBean;



public class PrersentationBean {

	ServiceBean service;
	A  a;
	

	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	
 public void setA(A a) {
		this.a = a;
	}


public void present() {
	 
	 service.calculateInterest();
	 System.out.println("A class address "+a);
	 System.out.println("calculated Interest Presented in presentation class");
	 
	 
 }
	
}
