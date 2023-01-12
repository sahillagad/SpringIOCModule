package com.masai;

public class Alpha {

	String name;
	int age;
	String address;
	
	
	
	
	public Alpha(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	public void funAlpha() {
		System.out.println("My Name is : "+name +" my address is "+ address+ "and my age is "+age);
		
		
	}
	
}
