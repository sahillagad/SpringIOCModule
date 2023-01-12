package Question2_1;

public class College {

	 Employee employee;
	 
	 

	
//	Constructor  Injection 
	public College(Employee employee) {
		super();
		this.employee = employee;
	}




	public void doJob(){
		System.out.println("Job is started");
      employee.startWork();
		}
	
}
