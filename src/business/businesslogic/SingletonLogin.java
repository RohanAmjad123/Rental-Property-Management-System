package business.businesslogic;

import business.usermodels.*;

/**
 * Class SingletonLogin
 * 
 * @since December 4th, 2021
 * @author Rohan Amjad
 * @author Ibrahim Asad
 * @version 1.0
 */
public class SingletonLogin {

	private static SingletonLogin onlyInstance = null;
	private User currentUser = null;

	/**
	 * SingletonLogin constuctor, Initializes the private variable values of currentUser by calling and 
	 * using the User() constructor to intilize currentUser
	 */ 
	private SingletonLogin() {
		currentUser = new User();
	}

	/**
	 * setCurrentUser method is a setter function, Initializes the private variable values of currentUser
	 * with the value of user that is passed through 
	 * @param user parameter is a Type User 
	 */ 
	public void setCurrentUser(User user) {
		currentUser = user;
	}
	
	/**
     * getCurrentUser method is a getter meathod, the private variables of
     * currentUser is returned as a User value
     * @return
     */
	public User getCurrentUser() {
		return currentUser;
	}

	/**
	 * logout function, is used to log the user out so that if the user is logged in through currentUser
	 * it will turn currentUser as null 
	 */
	public void logout() {
		if (currentUser != null) {
			currentUser = null;
		}
	}
	
	/**
     * getInstance method is a getter meathod, the private variables of
     * onlyInstance is returned as a User value if it is not null otherwise
     * it will intilize the onlyInstance variable by calling the constructor SingletonLogin() 
     * and then return it. This method is also a static method
     * @return
     */
	public static SingletonLogin getInstance() {
		if (onlyInstance == null) {
			onlyInstance = new SingletonLogin();
		}
		return onlyInstance;
	}

}
