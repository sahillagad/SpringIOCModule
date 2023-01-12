package com.masai.Service;

import com.masai.Dao.DaoBean;

public class ServiceBean {

	private DaoBean dao;


	
	public ServiceBean(DaoBean dao) {
		super();
		this.dao = dao;
	}



	public void calculateInterest() {
	
		dao.findAccount();
	  System.out.println("Interest calculated service bean");
	  	
	}
	
	
}
