package business.usermodels;

public class User {

	private String email;
	private String password;
	private String firstName;	
	private String lastName;
	private int userID;
	private String userType;
	
		
	public User(String e, String p, String f, String l, int uID, String uT){	
		email = e;
		password = p;
		firstName = f;
		lastName = l; 
		userID = uID;
		userType = uT;
	}
	
	public User(){	
		email = "";
		password = "";
		firstName = "";
		lastName = ""; 
		userID = 0;
		userType = "";
	}
	
	public void setEmail(String a){
		email = a;
	}
	
	public String getEmail(){
		return email;
	}
		
	
	public void setPassword(String a){
		password = a;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	public void setFirstname(String a){
		firstName = a;
	}
	
	public String getFirstname(){
		return firstName;
	}
	
		
	public void setLastname(String a){
		lastName = a;
	}
	
	public String getLastname(){
		return lastName;
	}
	
	public void setUserID(int a){
		userID = a;
	}
	
	public int getUserID(){
		return userID;
	}
	
	public void setUserType(String a){
		userType = a;
	}
	
	public String getUserType(){
		return userType;
	}
	
		
	
}
