package com.masai;

public class Alpha {
	
	private A aobj;
    private B bobj;
    private C cobj;
    private D dobj;
	public Alpha(A aobj, B bobj, C cobj, D dobj) {
		super();
		this.aobj = aobj;
		this.bobj = bobj;
		this.cobj = cobj;
		this.dobj = dobj;
	}
	public Alpha(A aobj, B bobj, C cobj) {
		super();
		this.aobj = aobj;
		this.bobj = bobj;
		this.cobj = cobj;
	}
	public Alpha(A aobj, B bobj) {
		super();
		this.aobj = aobj;
		this.bobj = bobj;
	}
	public Alpha() {
		super();
	}
    
    public void start() {
    	System.out.println("A class Object : "+aobj);
    	System.out.println("B class Object : "+bobj);
    	System.out.println("C class Object : "+cobj);
    	System.out.println("D class Object : "+dobj);
    	
    	
    	
    }
	
	

}
