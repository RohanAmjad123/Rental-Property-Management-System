
public class Address {
	
	private String streetName;
	private String postalCode;
	private String cityQuadrant;	
	private String city;
	private String stateProvince;
	private String country;
	
		
	public Address(String sn, String pc, String cq, String ct, String sp, String cou){	
		streetName = sn;
		postalCode = pc;
		cityQuadrant = cq;
		city = ct; 
		stateProvince = sp;
		country = cou;
	}
	
	
	
	
	public void setStreetName(String a){
		email = a;
	}
	
	public String getStreetName(){
		return email;
	}
		
	
	public void setPostalCode(String a){
		password = a;
	}
	
	public String getPostalCode(){
		return password;
	}
	
	
	public void setCityQuadrant(String a){
		firstName = a;
	}
	
	public String getCityQuadrant(){
		return firstName;
	}
	
		
	public void setCity(String a){
		lastName = a;
	}
	
	public String getCity(){
		return lastName;
	}
	
	public void setStateProvince(String a){
	userID = a;
	}
	
	public String getStateProvince(){
	return userID;
	}
	
	public void setCountry(String a){
		userType = a;
	}
	
	public String getCountry(){
		return userType;
	}
	
		
	
}
