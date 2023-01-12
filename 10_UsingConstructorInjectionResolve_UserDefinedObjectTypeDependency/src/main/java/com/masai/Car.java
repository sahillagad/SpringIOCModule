package com.masai;

public class Car implements Vechical {
	
	public void drive() {
		
		System.out.println("Car Is Strat...");
		
	}

	@Override
	public void getStart() {

		 drive();
	}

}
