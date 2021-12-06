package business.usermodels;

import java.util.*;
import business.businesslogic.*;

public class Landlord extends User {

	private ArrayList<Property> properties;

	public Landlord(String email, String password, String firstName, String lastName, int userID){
		super(email, password, firstName, lastName, userID, "landlord");
		properties = new ArrayList<Property>();
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public void addProperty(Property prop) {
		properties.add(prop);
	}

	public void deleteProperty(Property prop) {
		properties.remove(prop);
	}

}
