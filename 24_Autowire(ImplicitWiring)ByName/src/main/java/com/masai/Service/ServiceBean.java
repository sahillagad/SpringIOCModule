package com.masai.Service;

import com.masai.Dao.DaoBean;

public class ServiceBean {

	private DaoBean dao;

	public void setDao(DaoBean dao) {
		this.dao = dao;
	}
	
	public void calculateInterest() {
	
		dao.findAccount();
	  System.out.println("Interest calculated service bean");
	  	
	}
	
	
}
