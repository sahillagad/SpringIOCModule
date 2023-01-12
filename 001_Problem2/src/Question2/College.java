package Question2;

public class College {

	 Employee employee;
	 
	 
	
//		Setter Injection 
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
 
	




	public void doJob(){
		System.out.println("Job is started");
   employee.startWork();
		}
	
}
