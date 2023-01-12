package com.masai;

//Normal Java Class make Spring Bean We Need That Registered With The Spring Container
//For Registered we use Configration File That Name is any thing But We Give ApplicationContext.xml
public class MyBusinessClass {

	 private int age;
	 private String name;
	 private String add;
 	
	 
	 
	 //Setter Injection Point
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAdd(String add) {
		this.add = add;
	}




	public void funA() {
		
		System.out.println("I am Inside funA Of The MyBusinessClass Class");
	    System.out.println("My Name is "+name +" my age is "+age +" my address "+ add);
		
	    
	}
	
	
}
