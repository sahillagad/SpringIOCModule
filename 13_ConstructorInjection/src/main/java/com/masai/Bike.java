package com.masai;

public class Bike implements Vechical{
	
	
	public void ride() {
		
	System.out.println("Bike Is Strat..");
		
	}

	@Override
	public void getStart() {

		ride();
	}


}
