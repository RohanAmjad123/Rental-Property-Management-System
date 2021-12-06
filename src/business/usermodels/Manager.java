package business.usermodels;

public class Manager extends User {
		
	public Manager(String email, String password, String firstName, String lastName, int userID){
		super(email, password, firstName, lastName, userID, "manager");
	}
}
