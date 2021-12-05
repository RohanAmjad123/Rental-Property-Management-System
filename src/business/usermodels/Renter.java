
public class Renter extends User {

private ArrayList <SearchCriteria> subscription;

public Renter(){
	subscription = new ArrayList<SearchCriteria> ();
}


public ArrayList <SearchCriteria> getSubscriptions(){
return subscription;
}

public void addSubscription(SearchCriteria sub){
	
	subscription.add(sub);
}

public void deleteSubscription(SearchCriteria sub){
	
	subscription.remove(sub);
}


}
