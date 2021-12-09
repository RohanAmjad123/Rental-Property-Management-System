package business.businesslogic;

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

	public Address() {
		streetName = "";
		postalCode = "";
		cityQuadrant = "";
		city = ""; 
		stateProvince = "";
		country = "";
	}

	public void setStreetName(String a){
		streetName = a;
	}
	
	public String getStreetName(){
		return streetName;
	}
		
	
	public void setPostalCode(String a){
		postalCode = a;
	}
	
	public String getPostalCode(){
		return postalCode;
	}
	
	
	public void setCityQuadrant(String a){
		cityQuadrant = a;
	}
	
	public String getCityQuadrant(){
		return cityQuadrant;
	}
	
		
	public void setCity(String a){
		city = a;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setStateProvince(String a){
	stateProvince = a;
	}
	
	public String getStateProvince(){
	return stateProvince;
	}
	
	public void setCountry(String a){
		country = a;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String getAddressFormatted() {
		return this.streetName + " " + this.cityQuadrant + ", " + this.stateProvince + " " + this.stateProvince + ", " + this.postalCode;
	}
	
}
