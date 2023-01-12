package Question2_1;

public class Clerk implements Employee {

	
	public void registerStudent(){
	    System.out.println("enroll the Student in Collage");
	}
	@Override
	public void startWork() {
		
		registerStudent();
	}

}
