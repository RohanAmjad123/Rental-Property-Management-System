package business.businesslogic;

public class Property {

	private int landlordID;
	private int propertyID;
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
	private Date listingDate;
	private Date feeExpiry;
	private int feeAmount;

	public Property(int landlordID, int propertyID, String title, String description, String propertyType, int rent, int bedrooms, int bathrooms, int squareFeet,
					String furnished, String state, Address address, Date listingDate, Date feeExpiry, int feeAmount) {
		this.landlordID = landlordID;
		this.propertyID = propertyID;
		this.title = title;
		this.description = description;
		this.propertyType = propertyType;
		this.rent = rent;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.squareFeet = squareFeet;
		this.furnished = furnished;
		this.state = state;
		this.address = address;
		this.listingDate = listingDate;
		this.feeExpiry = feeExpiry;
		this.feeAmount = feeAmount;
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

	public int getLandlordID() {
		return landlordID;
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

	public Date getListingDate() {
		return listingDate;
	}

	public void setListingDate(Date d) {
		this.listingDate = d;
	}

	public Date getFeeExpiry() {
		return feeExpiry;
	}

	public void setFeeExpiry(Date d) {
		this.feeExpiry = d;
	}

	public int getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(int amount) {
		this.feeAmount = amount;
	}
}
