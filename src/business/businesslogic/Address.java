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

    /**
     * Address constuctor, Initializes the values of sn, pc, cq, ct
     * sp, and cou with streetName, postalCode, cityQuadrant, city, 
     * stateProvince, and country respectivly and throws an IllegalArgumentException 
     * if values are not valid such as having a number in country.
     * @param sn parameter is a Type String and represents streetName 
     * @param pc parameter is a Type String and represents postalCode 
     * @param cq parameter is a Type String and represents cityQuadrant 
     * @param ct parameter is a Type String and represents city
     * @param sp parameter is a Type String and represents stateProvince 
     * @param cou parameter is a Type String and represents country 
     */
  
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

    /**
     * Address constuctor, Initializes the private variables of
     * streetName, postalCode, cityQuadrant, city, stateProvince, 
     * and country with a string value of ""
     */
	public Address() {
		streetName = "";
		postalCode = "";
		cityQuadrant = "";
		city = "";
		stateProvince = "";
		country = "";
	}

    /**
     * setStreetName method is a setter meathod, the private variables of
     * streetName is initilized with the value of a
     * @param a, is a String type and is used to set the private variables of streetName
     */
	public void setStreetName(String a) {
		streetName = a;
	}

    /**
     * getStreetName method is a getter meathod, the private variables of
     * streetName is returned as a String value
     * @return
     */
	public String getStreetName() {
		return streetName;
	}

    /**
     * setPostalCode method is a setter meathod, the private variables of
     * postalCode is initilized with the value of a
     * @param a, is a String type and is used to set the private variables of postalCode
     */
	public void setPostalCode(String a) {
		postalCode = a;
	}
    /**
     * getPostalCode method is a getter meathod, the private variables of
     * postalCode is returned as a String value
     * @return
     */
	public String getPostalCode() {
		return postalCode;
	}
    /**
     * setCityQuadrant method is a setter meathod, the private variables of
     * cityQuadrant is initilized with the value of a
     * @param a, is a String type and is used to set the private variables of cityQuadrant
     */
	public void setCityQuadrant(String a) {
		cityQuadrant = a;
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
     * setCity method is a setter meathod, the private variables of
     * city is initilized with the value of a
     * @param a, is a String type and is used to set the private variables of city
     */
	public void setCity(String a) {
		city = a;
	}

	public String getCity() {
		return city;
	}
    /**
     * setStateProvince method is a setter meathod, the private variables of
     * stateProvince is initilized with the value of a
     * @param a, is a String type and is used to set the private variables of stateProvince
     */
	public void setStateProvince(String a) {
		stateProvince = a;
	}

    /**
     * getStateProvince method is a getter meathod, the private variables of
     * stateProvince is returned as a String value
     * @return
     */
	public String getStateProvince() {
		return stateProvince;
	}
    /**
     * setCountry method is a setter meathod, the private variables of
     * country is initilized with the value of a
     * @param a, is a String type and is used to set the private variables of country
     */
	public void setCountry(String a) {
		country = a;
	}
    /**
     * getCountry method is a getter meathod, the private variable of
     * country is returned as a String value
     * @return
     */
	public String getCountry() {
		return country;
	}
    /**
     * getAddressFormatted method is a method that formats the variable streetName, postalCode, cityQuadrant, city, 
     * stateProvince, and country, the private variables are formatted as
     *
     * (streetName + " " + cityQuadrant + ", " + city + " " + stateProvince + ", " + postalCode)
     *
     * as one single large String value, and is returned
     * @return
     */
	public String getAddressFormatted() {
		return this.streetName + " " + this.cityQuadrant + ", " + this.city + " " + this.stateProvince + ", "
				+ this.postalCode;
	}

}
