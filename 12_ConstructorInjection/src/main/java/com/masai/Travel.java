package com.masai;

public class Travel {
	
	//User Defiened Object Dependency
	Vechical vechical;
	
	int numOfPerson;
	
	
	//Constructor injection
	public Travel(Vechical vechical, int numOfPerson) {
		super();
		this.vechical = vechical;
		this.numOfPerson = numOfPerson;
	}
	

	public void funTravel() {
		
		System.out.println("I am Inside the funTravel of the Travel class");
		vechical.getStart();
		System.out.println("i am travel With my "+numOfPerson +" best Friend");
	     	
	}


	
}
