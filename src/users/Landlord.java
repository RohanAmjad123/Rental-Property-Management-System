public class Landlord extends User {

private ArrayList <Property> properties;

public Renter(){
	
	properties = new ArrayList<Property> ();
}


public ArrayList <Property> getProperties(){
return properties;
}

public void addProperty(Property prop){
	
	properties.add(prop);
}

public void deleteProperty(Property prop){
	
	properties.remove(prop);
}


}
