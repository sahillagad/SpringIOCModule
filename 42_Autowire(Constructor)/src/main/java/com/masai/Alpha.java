package com.masai;

public class Alpha {
	
	private A a;
	private A a1;
    private B b;

	public Alpha(A a, A a1, B b) {
		super();
		this.a = a;
		this.a1 = a1;
		this.b = b;
	}

	public Alpha(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Alpha() {
		super();
	}

	public void start() {
    	System.out.println("A   Object : "+a);
    	System.out.println("A1 Object : "+a1);
    	System.out.println("B Object    : "+b);
    }
	
}
