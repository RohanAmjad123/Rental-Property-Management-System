package business.businesslogic;

public class SearchCriteria{
		
	private String propertyType;
	private String renterID;
	private int bedrooms;
	private int bathrooms;
	private int maxRent;
	
	private String cityQuadrant;
	private String furnished;

	public SearchCriteria(String renterID, String propertyType, int bedrooms, int bathrooms, int maxRent, String cityQuadrant, String furnished) {
		this.renterID = renterID;
		this.propertyType = propertyType;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.maxRent = maxRent;
		this.cityQuadrant = cityQuadrant;
		this. furnished = furnished;
	}

	public SearchCriteria(String propertyType, int bedrooms, int bathrooms, int maxRent, String cityQuadrant, String furnished) {
		this.renterID = "";
		this.propertyType = propertyType;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.maxRent = maxRent;
		this.cityQuadrant = cityQuadrant;
		this. furnished = furnished;
	}

	public SearchCriteria() {
		this.renterID = "";
		this.propertyType = "";
		this.bedrooms = 0;
		this.bathrooms = 0;
		this.maxRent = 0;
		this.cityQuadrant = "";
		this. furnished = "";
	}
	
	public String getPropertyType(){
		return propertyType;	
	}
		
	public void setPropertyType(String propType){
		this.propertyType = propType;
	}	
	
	public int getBedrooms(){
		return bedrooms;	
	}
		
	public void setBedrooms(int bedrooms){
		this.bedrooms = bedrooms;
	}	

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	
	public int getMaxRent(){
		return maxRent;	
	}
		
	public void setMaxRent(int maxRent){
		this.maxRent = maxRent;
	}	
	
	public String getCityQuadrant(){
		return cityQuadrant;
	}
	
	public void setCityQuadrant(String cityQuadrant){
		this.cityQuadrant = cityQuadrant;
	}
	
	public String getFurnished() {
		return furnished;
	}
	
	public void setFurnished(String furnished){
		this.furnished = furnished;
	}
	
	public String getRenterID() {
		return this.renterID;
	}
	
	public void setRenterID(String id) {
		this.renterID = id;
	}
	
}
