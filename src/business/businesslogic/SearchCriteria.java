package business.businesslogic;

/**
 * Class SearchCriteria
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Ibrahim Asad
 * @version 1.0
 */
public class SearchCriteria {

	private String propertyType;
	private String renterID;
	private int bedrooms;
	private int bathrooms;
	private int maxRent;

	private String cityQuadrant;
	private String furnished;

	/**
	 * SearchCriteria constuctor, Initializes the private variable values of renterID propertyType bedrooms bathrooms maxRent
	 * cityQuadrant furnished with the values renterID propertyType bedrooms bathrooms maxRent
	 * cityQuadrant and furnished that is passed through the constructor
	 * @param renterID parameter is a Type String 
	 * @param propertyType parameter is a Type String 
	 * @param bedrooms parameter is a Type int 
	 * @param bathrooms parameter is a Type int 
	 * @param maxRent parameter is a Type int
	 * @param cityQuadrant parameter is a Type String 
	 * @param furnished parameter is a Type String 
	 */ 
	public SearchCriteria(String renterID, String propertyType, int bedrooms, int bathrooms, int maxRent,
			String cityQuadrant, String furnished) {
		this.renterID = renterID;
		this.propertyType = propertyType;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.maxRent = maxRent;
		this.cityQuadrant = cityQuadrant;
		this.furnished = furnished;
	}

	/**
	 * SearchCriteria constuctor, Initializes the private variable values of propertyType bedrooms bathrooms maxRent
	 * cityQuadrant furnished with the values propertyType bedrooms bathrooms maxRent
	 * cityQuadrant and furnished that is passed through the constructor and also intilizes the renterID with ""
	 * @param propertyType parameter is a Type String 
	 * @param bedrooms parameter is a Type int 
	 * @param bathrooms parameter is a Type int 
	 * @param maxRent parameter is a Type int
	 * @param cityQuadrant parameter is a Type String 
	 * @param furnished parameter is a Type String 
	 */ 
	public SearchCriteria(String propertyType, int bedrooms, int bathrooms, int maxRent, String cityQuadrant,
			String furnished) {
		this.renterID = "";
		this.propertyType = propertyType;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.maxRent = maxRent;
		this.cityQuadrant = cityQuadrant;
		this.furnished = furnished;
	}

	/**
	 * SearchCriteria constuctor, Initializes the private variable values of renterID propertyType bedrooms bathrooms maxRent
	 * cityQuadrant and furnished. The string variable are initilized with the String value of "" and the int variables 
	 * are initilized with an int value of 0
	 */ 
	public SearchCriteria() {
		this.renterID = "";
		this.propertyType = "";
		this.bedrooms = 0;
		this.bathrooms = 0;
		this.maxRent = 0;
		this.cityQuadrant = "";
		this.furnished = "";
	}

	/**
     * toString method, has an Overrinde and it formats a String as
     * 
     *  "- " + "Property Type: " + this.getPropertyType() + ", " + " Bedrooms: " + String.valueOf(this.getBedrooms()) + ", " + 
     * "  Bathrooms: " + String.valueOf(this.getBathrooms()) + ", " + "	Max Rent: " + String.valueOf(this.getMaxRent()) + ", " +
     * "	City Quadrant: " + this.getCityQuadrant() + ", " + "	Furnished: " + this.getFurnished()
     * 
     * and returns that string
     * @return
     */
	@Override
	public String toString() {
		String s = "- ";
		s += "Property Type: " + this.getPropertyType() + ", ";
		s += "	Bedrooms: " + String.valueOf(this.getBedrooms()) + ", ";
		s += "	Bathrooms: " + String.valueOf(this.getBathrooms()) + ", ";
		s += "	Max Rent: " + String.valueOf(this.getMaxRent()) + ", ";
		s += "	City Quadrant: " + this.getCityQuadrant() + ", ";
		s += "	Furnished: " + this.getFurnished();
		return s;
	}
	
	
	/**
     * getPropertyType method is a getter meathod, the private variables of
     * propertyType is returned as a String value
     * @return
     */
	public String getPropertyType() {
		return propertyType;
	}
	
	
    /**
     * setPropertyType method is a setter meathod, the private variables of
     * propertyType is initilized with the value of propType that is passed into the function
     * @param propType, is a String type and is used to set the private variables of propertyType
     */
	public void setPropertyType(String propType) {
		this.propertyType = propType;
	}


	/**
     * getBedrooms method is a getter meathod, the private variables of
     * bedrooms is returned as a int value
     * @return
     */
	public int getBedrooms() {
		return bedrooms;
	}

    /**
     * setBedrooms method is a setter meathod, the private variables of
     * bedrooms is initilized with the value of bedrooms that is passed into the function
     * @param bedrooms, is a int type and is used to set the private variables of bedrooms
     */
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}


	/**
     * getBathrooms method is a getter meathod, the private variables of
     * bathrooms is returned as a int value
     * @return
     */
	public int getBathrooms() {
		return bathrooms;
	}
	
    /**
     * setBathrooms method is a setter meathod, the private variables of
     * bathrooms is initilized with the value of bathrooms that is passed into the function
     * @param bathrooms, is a int type and is used to set the private variables of bathrooms
     */
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	
	/**
     * getMaxRent method is a getter meathod, the private variables of
     * maxRent is returned as a int value
     * @return
     */

	public int getMaxRent() {
		return maxRent;
	}

    /**
     * setMaxRent method is a setter meathod, the private variables of
     * maxRent is initilized with the value of maxRent that is passed into the function
     * @param maxRent, is a int type and is used to set the private variables of maxRent
     */
	public void setMaxRent(int maxRent) {
		this.maxRent = maxRent;
	}
	
	/**
     * getCityQuadrant method is a getter meathod, the private variables of
     * cityQuadrant is returned as a String value
     * @return
     */
	public String getCityQuadrant() {
		return cityQuadrant;
	}
	
    /**
     * setCityQuadrant method is a setter meathod, the private variables of
     * cityQuadrant is initilized with the value of cityQuadrant that is passed into the function
     * @param cityQuadrant, is a String type and is used to set the private variables of cityQuadrant
     */
	public void setCityQuadrant(String cityQuadrant) {
		this.cityQuadrant = cityQuadrant;
	}
	
	/**
     * getFurnished method is a getter meathod, the private variables of
     * furnished is returned as a String value
     * @return
     */
	public String getFurnished() {
		return furnished;
	}
	
    /**
     * setFurnished method is a setter meathod, the private variables of
     * furnished is initilized with the value of furnished that is passed into the function
     * @param furnished, is a String type and is used to set the private variables of furnished
     */
	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}

	/**
     * getRenterID method is a getter meathod, the private variables of
     * renterID is returned as a String value
     * @return
     */
	public String getRenterID() {
		return this.renterID;
	}
	
    /**
     * setFurnished method is a setter meathod, the private variables of
     * renterID is initilized with the value of id that is passed into the function
     * @param id, is a String type and is used to set the private variables of renterID
     */
	public void setRenterID(String id) {
		this.renterID = id;
	}

}
