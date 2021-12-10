package business.businesslogic;

import business.usermodels.*;

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

	public static SingletonLogin getInstance() {
		if (onlyInstance == null) {
			onlyInstance = new SingletonLogin();
		}
		return onlyInstance;
	}

}
