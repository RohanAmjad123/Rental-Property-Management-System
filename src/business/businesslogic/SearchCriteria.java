public class SearchCriteria{
		
	private String propertyType;
	
	private int bedrooms;
	private int bathrooms;
	private int maxRent;
	
	private String cityQuadrant;
	private String furnished;

	public String getPropertyType(){
	return propertyType;	
		}
		
	public void setPropertyType(String a){
	propertyType = a;
	}	
	
	public int getBedrooms(){
	return bedrooms;	
		}
		
	public void setBedrooms(int a){
	bedrooms = a;
	}	
	
	public int getBedrooms(){
	return bedrooms;
	}
	
	public void setBedrooms(int a){
	bedrooms = a;
	}
	
	public int getMaxRent(){
	return maxRent;	
	}
		
	public void setMaxRent(int a){
	maxRent = a;
	}	
	
	public String getCityQuadrant(){
		return cityQuadrant;
	}
	
	public void setCityQuadrant(String a){
	cityQuadrant = a;
	}
	
	
	public String getFurnished(){
		return furnished;
	}
	
	public void setFurnished(String a){
	furnished = a;
	}
	
	
	
}
