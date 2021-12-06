package business.usermodels;

public class Manager extends User {
		
	public Manager(String email, String password, String firstName, String lastName){
		super(email, password, firstName, lastName, "manager");
	}
}
