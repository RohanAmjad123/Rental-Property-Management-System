package business.businesslogic;

/**
 * Class Property
 * 
 * @since December 4th, 2021
 * @author Rohan Amjad
 * @author Ibrahim Asad
 * @author Azlan Amjad
 * @version 1.0
 */
public class Property {

	private String landlordID;
	private String title;
	private String description;
	private String propertyType;

	private int rent;
	private int bedrooms;
	private int bathrooms;
	private int squareFeet;

	private String furnished;
	private String state;
	private Address address;
	private DateModel listingDate;
	private DateModel feeExpiry;
	private int feeAmount;

	private DateModel rentalDate;

    /**
     * Property constuctor, Initializes the private variables of title description propertyType 
     * rent bedrooms bathrooms squareFeet furnished landlordID state 
     * feeExpiry feeAmount listingDate address with the value that are passed through of
     * title description propertyType rent bedrooms bathrooms squareFeet 
     * furnished landlordID state feeExpiry feeAmount listingDate address
     * However the rentingDate is intilized to 2001/01/01
     * @param title parameter is a Type String 
     * @param description parameter is a Type String 
     * @param propertyType parameter is a Type String 
     * @param rent parameter is a Type int 
     * @param bedrooms parameter is a Type int
     * @param bathrooms parameter is a Type int  
     * @param squareFeet parameter is a Type int 
     * @param furnished parameter is a Type String 
     * @param landlordID parameter is a Type String 
     * @param state parameter is a Type String 
     * @param freeExpiry parameter is a Type DateModel
     * @param feeAmount parameter is a Type int
     * @param listingDate parameter is a Type DateModel  
     * @param address parameter is a Type Address  
     */

	public Property(String title, String description, String propertyType, int rent, int bedrooms, int bathrooms,
			int squareFeet,
			String furnished, String landlordID, String state, DateModel feeExpiry, int feeAmount,
			DateModel listingDate, Address address) {
		this.title = title;
		this.description = description;
		this.propertyType = propertyType;
		this.rent = rent;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.squareFeet = squareFeet;
		this.furnished = furnished;
		this.landlordID = landlordID;
		this.state = state;
		this.feeExpiry = feeExpiry;
		this.feeAmount = feeAmount;
		this.address = address;
		this.listingDate = listingDate;
		this.rentalDate = new DateModel("2000", "01", "01");
	}

    /**
     * Property constuctor, Initializes the private variables of title description propertyType 
     * rent bedrooms bathrooms squareFeet furnished landlordID state 
     * feeExpiry feeAmount listingDate address and rentalDate with the value that are passed through of
     * title description propertyType rent bedrooms bathrooms squareFeet 
     * furnished landlordID state feeExpiry feeAmount listingDate address and rentalDate
     * @param title parameter is a Type String 
     * @param description parameter is a Type String 
     * @param propertyType parameter is a Type String 
     * @param rent parameter is a Type int 
     * @param bedrooms parameter is a Type int
     * @param bathrooms parameter is a Type int  
     * @param squareFeet parameter is a Type int 
     * @param furnished parameter is a Type String 
     * @param landlordID parameter is a Type String 
     * @param state parameter is a Type String 
     * @param freeExpiry parameter is a Type DateModel
     * @param feeAmount parameter is a Type int
     * @param listingDate parameter is a Type DateModel  
     * @param rentalDate parameter is a Type DateModel  
     * @param address parameter is a Type Address  
     */
	public Property(String title, String description, String propertyType, int rent, int bedrooms, int bathrooms,
			int squareFeet,
			String furnished, String landlordID, String state, DateModel feeExpiry, int feeAmount,
			DateModel listingDate, Address address,
			DateModel rentalDate) {
		this.title = title;
		this.description = description;
		this.propertyType = propertyType;
		this.rent = rent;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.squareFeet = squareFeet;
		this.furnished = furnished;
		this.landlordID = landlordID;
		this.state = state;
		this.feeExpiry = feeExpiry;
		this.feeAmount = feeAmount;
		this.address = address;
		this.listingDate = listingDate;
		this.rentalDate = rentalDate;
	}

    /**
     * Property constuctor, Initializes the private variables of title description propertyType 
     * rent bedrooms bathrooms squareFeet furnished landlordID state 
     * feeExpiry feeAmount listingDate address and rentalDate, for the String type variables 
     * it get the String value "", the intger variables are intilized with, and lastly the DateModel 
     * and Address type variables are intilized with their own constructor
     */

	public Property() {
		this.title = "";
		this.description = "";
		this.propertyType = "";
		this.rent = 0;
		this.bedrooms = 0;
		this.bathrooms = 0;
		this.squareFeet = 0;
		this.furnished = "";
		this.landlordID = "";
		this.state = "";
		this.feeExpiry = new DateModel();
		this.feeAmount = 0;
		this.address = new Address();
		this.listingDate = new DateModel();
	}



	/**
     * toString method, has an Overrinde and it formats a String as
     *  "- " + this.getTitle() + ", " +  "	Rent: $" + this.getRent() + ", " + this.getAddress().getAddressFormatted() + ", " + this.getState()
     * and returns that string
     * @return
     */
	@Override
	public String toString() {
		String s = "- ";
		s += this.getTitle() + ", ";
		s += "	Rent: $" + this.getRent() + ", ";
		s += this.getAddress().getAddressFormatted() + ", ";
		s += this.getState();
		return s;
	}

	/**
     * getTitle method is a getter meathod, the private variables of
     * title is returned as a String value
     * @return
     */
	public String getTitle() {
		return title;
	}
	
    /**
     * setTitle method is a setter meathod, the private variables of
     * title is initilized with the value of title that is passed into the function
     * @param title, is a String type and is used to set the private variables of title
     */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
     * getDescription method is a getter meathod, the private variables of
     * description is returned as a String value
     * @return
     */
	public String getDescription() {
		return description;
	}
   
    /**
     * setDescription method is a setter meathod, the private variables of
     * description is initilized with the value of description that is passed into the function
     * @param description, is a String type and is used to set the private variables of description
     */
	public void setDescription(String description) {
		this.description = description;
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
     * propertyType is initilized with the value of propertyType that is passed into the function
     * @param propertyType, is a String type and is used to set the private variables of propertyType
     */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	/**
     * getRent method is a getter meathod, the private variables of
     * rent is returned as a int value
     * @return
     */
	public int getRent() {
		return rent;
	}
 
    /**
     * setRent method is a setter meathod, the private variables of
     * rent is initilized with the value of rent that is passed into the function
     * @param rent, is a int type and is used to set the private variables of rent
     */
	public void setRent(int rent) {
		this.rent = rent;
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
		return this.bathrooms;
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
     * getSquareFeet method is a getter meathod, the private variables of
     * squareFeet is returned as a int value
     * @return
     */
	public int getSquareFeet() {
		return squareFeet;
	}
  
    /**
     * setSquareFeet method is a setter meathod, the private variables of
     * squareFeet is initilized with the value of sq that is passed into the function
     * @param sq, is a int type and is used to set the private variables of squareFeet
     */
	public void setSquareFeet(int sq) {
		this.squareFeet = sq;
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
     * getLandlordID method is a getter meathod, the private variables of
     * landlordID is returned as a String value
     * @return
     */
	public String getLandlordID() {
		return landlordID;
	}

    /**
     * setLandlordID method is a setter meathod, the private variables of
     * landlordID is initilized with the value of id that is passed into the function
     * @param landlordID, is a String type and is used to set the private variables of landlordID
     */
	public void setLandlordID(String id) {
		this.landlordID = id;
	}

	/**
     * getState method is a getter meathod, the private variables of
     * state is returned as a String value
     * @return
     */
	public String getState() {
		return state;
	}

    /**
     * setState method is a setter meathod, the private variables of
     * state is initilized with the value of state that is passed into the function
     * @param state, is a String type and is used to set the private variables of state
     */
	public void setState(String state) {
		this.state = state;
	}

	/**
     * getAddress method is a getter meathod, the private variables of
     * address is returned as a Address value
     * @return
     */
	public Address getAddress() {
		return address;
	}
	
	/**
     * setAddress method is a setter meathod, the private variables of
     * address is initilized with the value of address that is passed into the function
     * @param address, is a Address type and is used to set the private variables of address
     */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
     * getListingDate method is a getter meathod, the private variables of
     * listingDate is returned as a DateModel value
     * @return
     */
	public DateModel getListingDate() {
		return listingDate;
	}

	/**
     * setListingDate method is a setter meathod, the private variables of
     * listingDate is initilized with the value of d that is passed into the function
     * @param d, is a DateModel type and is used to set the private variables of listingDate
     */
	public void setListingDate(DateModel d) {
		this.listingDate = d;
	}

	/**
     * getFeeExpiry method is a getter meathod, the private variables of
     * feeExpiry is returned as a DateModel value
     * @return
     */
	public DateModel getFeeExpiry() {
		return feeExpiry;
	}

	/**
     * setFeeExpiry method is a setter meathod, the private variables of
     * feeExpiry is initilized with the value of d that is passed into the function
     * @param d, is a DateModel type and is used to set the private variables of feeExpiry
     */
	public void setFeeExpiry(DateModel d) {
		this.feeExpiry = d;
	}
	
	/**
     * getFeeAmount method is a getter meathod, the private variables of
     * feeAmount is returned as a int value
     * @return
     */
	public int getFeeAmount() {
		return feeAmount;
	}

    /**
     * setFeeAmount method is a setter meathod, the private variables of
     * feeAmount is initilized with the value of amount that is passed into the function
     * @param feeAmount, is a int type and is used to set the private variables of feeAmount
     */
	public void setFeeAmount(int amount) {
		this.feeAmount = amount;
	}

	/**
     * setRentalDate method is a setter meathod, the private variables of
     * rentalDate is initilized with the value of rentalDate that is passed into the function
     * @param rentalDate, is a DateModel type and is used to set the private variables of rentalDate
     */
	public void setRentalDate(DateModel rentalDate) {
		this.rentalDate = rentalDate;
	}


	/**
     * getRentalDate method is a getter meathod, the private variables of
     * rentalDate is returned as a DateModel value
     * @return
     */
	public DateModel getRentalDate() {
		return this.rentalDate;
	}
}
