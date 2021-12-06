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
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
		
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
		
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setUserID(int userID){
		this.userID = userID;
	}
	
	public int getUserID(){
		return userID;
	}
	
	public void setUserType(String userType){
		this.userType = userType;
	}
	
	public String getUserType(){
		return userType;
	}
	
		
	
}
