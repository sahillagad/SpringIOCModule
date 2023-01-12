package com.masai.Persentation;

import com.masai.Service.ServiceBean;

public class PrersentationBean {

	ServiceBean service;

	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	
 public void present() {
	 
	 service.calculateInterest();
	 System.out.println("calculated Interest Presented in presentation class");
	 
 }
	
}
