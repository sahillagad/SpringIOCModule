package Question2_1;

public class Teacher  implements Employee{

	public void teaches(){
	      System.out.println("Teacher teaches");
	}

	@Override
	public void startWork() {
		teaches();
		
	}
	
	
}
