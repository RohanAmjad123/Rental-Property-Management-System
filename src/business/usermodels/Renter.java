package business.usermodels;

import business.businesslogic.*;
import java.util.*;

public class Renter extends User {

	private ArrayList <SearchCriteria> subscriptions;

	public Renter(String email, String password, String firstName, String lastName, int userID){
		super(email, password, firstName, lastName, userID, "renter");
		subscriptions = new ArrayList<SearchCriteria>();
	}	

	public ArrayList <SearchCriteria> getSubscriptions(){
		return subscriptions;
	}

	public void addSubscription(SearchCriteria sub){	
		subscriptions.add(sub);
	}
	
	public void deleteSubscription(SearchCriteria sub){
		subscriptions.remove(sub);
	}

}
