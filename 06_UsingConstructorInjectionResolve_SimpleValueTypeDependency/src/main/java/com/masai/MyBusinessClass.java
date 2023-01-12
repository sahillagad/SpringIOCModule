package com.masai;

//Normal Java Class make Spring Bean We Need That Registered With The Spring Container
//For Registered we use Configration File That Name is any thing But We Give ApplicationContext.xml
public class MyBusinessClass {

	 private int age;
	 private String name;
	 private String add;
 	
	 
	 
	 //Constructor Injection Point
		public MyBusinessClass(int age, String name, String add) {
			super();
			this.age = age;
			this.name = name;
			this.add = add;
		}
		


	public void funA() {
		
		System.out.println("I am Inside funA Of The MyBusinessClass Class");
	    System.out.println("My Name is "+name +" my age is "+age +" my address "+ add);
		
	    
	}



	
}
