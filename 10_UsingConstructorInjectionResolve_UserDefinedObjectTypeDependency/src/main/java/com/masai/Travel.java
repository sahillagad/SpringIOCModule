package com.masai;

public class Travel {
	
	//User Defiened Object Dependency
	Vechical vechical;
	
	//Constructor injection
	public Travel(Vechical vechical) {
		super();
		this.vechical = vechical;
	}


	public void funTravel() {
		
		System.out.println("I am Inside the funTravel of the Travel class");
		vechical.getStart();
		
	}

	
}
