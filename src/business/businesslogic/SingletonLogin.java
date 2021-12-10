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

	private SingletonLogin() {
		currentUser = new User();
	}

	public void setCurrentUser(User user) {
		currentUser = user;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void logout() {
		if (currentUser != null) {
			currentUser = null;
		}
	}

	public static SingletonLogin getInstance() {
		if (onlyInstance == null) {
			onlyInstance = new SingletonLogin();
		}
		return onlyInstance;
	}

}
