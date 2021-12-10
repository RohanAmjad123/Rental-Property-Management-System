package business.businesslogic;

/**
 * Class DateModel
 * 
 * @since December 4th, 2021
 * @author Rohan Amjad
 * @version 1.0
 */
public class DateModel {

	private String day;
	private String month;
	private String year;
    /**
     * DateModel Constructor, Initializes the values private varaiables of
     * day, month, and year with the variable passed into the Constructor,
     * day, month, and yearm
     * @param year is a Type String
     * @param month is a Type String
     * @param day is a Type String 
     */
  
	public DateModel(String year, String month, String day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

    /**
	 * DateModel Constructor, Initializes the values private varaiables of
     * day, month, and year with a string value of ""
     */

	public DateModel() {
		day = "01";
		month = "01";
		year = "2000";
	}
	
    /**
     * setYear method is a setter meathod, the private variables of
     * year is initilized with the value of year that is passed into the function
     * @param a, is a String type and is used to set the private variables of year
     */
	public void setYear(String year) {
		this.year = year;
	}
	/**
     * getYear method is a getter meathod, the private variables of
     * year is returned as a String value
     * @return
     */
	public String getYear() {
		return year;
	}
    /**
     * setMonth method is a setter meathod, the private variables of
     * month is initilized with the value of month that is passed into the function
     * @param a, is a String type and is used to set the private variables of month
     */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
     * getMonth method is a getter meathod, the private variables of
     * month is returned as a String value
     * @return
     */
	public String getMonth() {
		return month;
	}
    /**
     * setDay method is a setter meathod, the private variables of
     * day is initilized with the value of day that is passed into the function
     * @param a, is a String type and is used to set the private variables of day
     */
	public void setDay(String day) {
		this.day = day;
	}
	/**
     * getDay method is a getter meathod, the private variables of
     * day is returned as a String value
     * @return
     */
	public String getDay() {
		return day;
	}
    /**
     * getAddressFormatted method is a method that formats the variable year, month, 
     * and day, the private variables are formatted as
     *
     * (date = year + "-" + month + "-" + day)
     *
     * as one single large String value, and is returned
     * @return
     */
	public String getDateFormatted() {
		String date = year + "-" + month + "-" + day;
		return date;
	}

}
