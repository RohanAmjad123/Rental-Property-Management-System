package business.businesslogic;

import java.util.regex.*;

/**
 * Class Address
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Ibrahim Asad
 * @version 1.0
 */
public class Address {
	private String streetName;
	private String postalCode;
	private String cityQuadrant;
	private String city;
	private String stateProvince;
	private String country;

	public Address(String sn, String pc, String cq, String ct, String sp, String cou) throws IllegalArgumentException {
		Pattern myPattern;
		Matcher myMatcher;
		boolean isMatch;
		
		// street name
		streetName = sn;

		// postal code
		myPattern = Pattern.compile("^[A-Z][0-9][A-Z]\\s[0-9][A-Z][0-9]$");
		myMatcher = myPattern.matcher(pc);
		isMatch = myMatcher.find();
		if (isMatch) {
			postalCode = pc;
		}
		else {
			throw new IllegalArgumentException();
		}

		// city quadrant
		myPattern = Pattern.compile("^[NS][EW]$");
		myMatcher = myPattern.matcher(cq);
		isMatch = myMatcher.find();
		if (isMatch) {
			cityQuadrant = cq;
		}
		else {
			throw new IllegalArgumentException();
		}

		// city
		myPattern = Pattern.compile("^[a-zA-Z]+$");
		myMatcher = myPattern.matcher(ct);
		isMatch = myMatcher.find();
		if (isMatch) {
			city = ct;
		}
		else {
			throw new IllegalArgumentException();
		}

		// state / province
		myPattern = Pattern.compile("^[A-Z][A-Z]$");
		myMatcher = myPattern.matcher(sp);
		isMatch = myMatcher.find();
		if (isMatch) {
			stateProvince = sp;
		}
		else {
			throw new IllegalArgumentException();
		}

		// country
		myPattern = Pattern.compile("^[a-zA-Z]+$");
		myMatcher = myPattern.matcher(cou);
		isMatch = myMatcher.find();
		if (isMatch) {
			country = cou;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public Address() {
		streetName = "";
		postalCode = "";
		cityQuadrant = "";
		city = "";
		stateProvince = "";
		country = "";
	}

	public void setStreetName(String a) {
		streetName = a;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setPostalCode(String a) {
		postalCode = a;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setCityQuadrant(String a) {
		cityQuadrant = a;
	}

	public String getCityQuadrant() {
		return cityQuadrant;
	}

	public void setCity(String a) {
		city = a;
	}

	public String getCity() {
		return city;
	}

	public void setStateProvince(String a) {
		stateProvince = a;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setCountry(String a) {
		country = a;
	}

	public String getCountry() {
		return country;
	}

	public String getAddressFormatted() {
		return this.streetName + " " + this.cityQuadrant + ", " + this.city + " " + this.stateProvince + ", "
				+ this.postalCode;
	}

}
