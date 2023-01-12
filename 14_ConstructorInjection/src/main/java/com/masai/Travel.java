package com.masai;

public class Travel {
	
	//User Defiened Object Dependency
	Vechical vechical;
	
	int numOfPerson;
	
	
	//Parameterized Constructor injection give exception if we not configure the dependency 
	public Travel(Vechical vechical, int numOfPerson) {
		super();
		this.vechical = vechical;
		this.numOfPerson = numOfPerson;
	}
	

//zero argument  Constructor injection point 
	public Travel() {
		super();
	}

	

	public void funTravel() {
		
		System.out.println("I am Inside the funTravel of the Travel class");
		System.out.println("i am travel With my "+numOfPerson +" best Friend");
		System.out.println("vechical details "+vechical);
	     	
	}


	
}
