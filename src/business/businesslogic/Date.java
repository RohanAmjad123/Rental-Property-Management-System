package business.businesslogic;

public class Date {
	
	private String day;
	private String month;
	private String year;	
		
	public Date(String d, String m, String y){
		day = d;
		month = m;
		year = y;
	}

	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public String getYear(){
		return year;
	}
		
	
	public void setMonth(String month){
		this.month = month;
	}
	
	public String getMonth(){
		return month;
	}
	
	
	public void setDay(String day){
		this.day = day;
	}
	
	public String getDay(){
		return day;
	}
	
	
	
	
	
}
