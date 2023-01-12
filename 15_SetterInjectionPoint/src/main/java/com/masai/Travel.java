package com.masai;

public class Travel {
	
	//User Defiened Object Dependency
	Vechical vechical;
	
	int numOfPerson;
	
	
	//Setter Constructor injection dependency is Optional 
	public void setVechical(Vechical vechical) {
		this.vechical = vechical;
	}


	public void setNumOfPerson(int numOfPerson) {
		this.numOfPerson = numOfPerson;
	}


	

	public void funTravel() {
		
		System.out.println("I am Inside the funTravel of the Travel class");
		System.out.println("i am travel With my "+numOfPerson +" best Friend");
		System.out.println("vechical details "+vechical);
	     	
	}	
}
