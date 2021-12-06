package business.businesslogic;

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

	public Property(String title, String description, String propertyType, int rent, int bedrooms, int bathrooms, int squareFeet,
					String furnished, String landlordID, String state, DateModel feeExpiry, int feeAmount, DateModel listingDate, Address address) {
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
	}

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getBathrooms() {
		return this.bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(int sq) {
		this.squareFeet = sq;
	}

	public String getFurnished() {
		return furnished;
	}

	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}

	public String getLandlordID() {
		return landlordID;
	}

	public void setLandlordID(String id) {
		this.landlordID = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DateModel getListingDate() {
		return listingDate;
	}

	public void setListingDate(DateModel d) {
		this.listingDate = d;
	}

	public DateModel getFeeExpiry() {
		return feeExpiry;
	}

	public void setFeeExpiry(DateModel d) {
		this.feeExpiry = d;
	}

	public int getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(int amount) {
		this.feeAmount = amount;
	}
}
