package business.usermodels;

/**
 * Class User
 * 
 * @since December 4th, 2021
 * @author Rohan Amjad
 * @author Ibrahim Asad
 * @author Azlan Amjad
 * @version 1.0
 */
public class User {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;


email, password, firstName, lastName, userType

	/**
	 * User constuctor, Initializes the private variable values of email, password, firstName, lastName, userType
	 * with the values email, password, firstName, lastName, userType that is passed through the constructor
	 * @param email parameter is a Type String 
	 * @param password parameter is a Type String 
	 * @param firstName parameter is a Type String
	 * @param lastName parameter is a Type String 
	 * @param userType parameter is a Type String 
	 */ 
	public User(String email, String password, String firstName, String lastName, String userType) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
	}
	
	/**
	 * User constuctor, Initializes the private variable values of email, password, firstName, lastName, userType
	 * with the String value of ""
	 */ 
	public User() {
		email = "";
		password = "";
		firstName = "";
		lastName = "";
		userType = "";
	}


	/**
     * toString method, has an Override and it formats a String as
     * 
     *  "- " + "Name: " + this.getFirstName() + " " + this.getLastName() + ", " + "	Email: " + this.getEmail()
     * 
     * and returns that string
     * @return
     */
	@Override
	public String toString() {
		String s = "- ";
		s += "Name: " + this.getFirstName() + " " + this.getLastName() + ", ";
		s += "	Email: " + this.getEmail();
		return s;
	}



    /**
     * setEmail method is a setter meathod, the private variables of
     * email is initilized with the value of email that is passed into the function
     * @param email, is a String type and is used to set the private variables of email
     */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * getEmail method is a getter meathod, the private variables of
     * email is returned as a String value
     * @return
     */
	public String getEmail() {
		return email;
	}

    /**
     * setPassword method is a setter meathod, the private variables of
     * password is initilized with the value of password that is passed into the function
     * @param password, is a String type and is used to set the private variables of password
     */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
     * getPassword method is a getter meathod, the private variables of
     * password is returned as a String value
     * @return
     */
	public String getPassword() {
		return password;
	}

    /**
     * setFirstName method is a setter meathod, the private variables of
     * firstName is initilized with the value of firstName that is passed into the function
     * @param firstName, is a String type and is used to set the private variables of firstName
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
     * getFirstName method is a getter meathod, the private variables of
     * firstName is returned as a String value
     * @return
     */
	public String getFirstName() {
		return firstName;
	}

    /**
     * setLastName method is a setter meathod, the private variables of
     * lastName is initilized with the value of lastName that is passed into the function
     * @param lastName, is a String type and is used to set the private variables of lastName
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
     * getLastName method is a getter meathod, the private variables of
     * lastName is returned as a String value
     * @return
     */
	public String getLastName() {
		return lastName;
	}

    /**
     * setUserType method is a setter meathod, the private variables of
     * userType is initilized with the value of userType that is passed into the function
     * @param userType, is a String type and is used to set the private variables of userType
     */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
     * getUserType method is a getter meathod, the private variables of
     * userType is returned as a String value
     * @return
     */
	public String getUserType() {
		return userType;
	}

}
