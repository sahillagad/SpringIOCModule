package com.masai;

public class Alpha {
	
	private A aobj;
    private B bobj;
    private C cobj;
    private D dobj;

    
    
    public void setAobj(A aobj) {
		this.aobj = aobj;
	}



	public void setBobj(B bobj) {
		this.bobj = bobj;
	}



	public void setCobj(C cobj) {
		this.cobj = cobj;
	}



	public void setDobj(D dobj) {
		this.dobj = dobj;
	}



	public void start() {
    	System.out.println("A class Object : "+aobj);
    	System.out.println("B class Object : "+bobj);
    	System.out.println("C class Object : "+cobj);
    	System.out.println("D class Object : "+dobj);
    	
    	
    	
    }
	
	

}
