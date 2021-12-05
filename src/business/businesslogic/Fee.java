

public class Fee {
	
	private String feePeriod;
	private String feeAmound;
	
	
		
	public Date(String fp, String fa){
		feePeriod = fp;
		feeAmound = fa;

	}
			
	public Date(){
		feePeriod = "";
		feeAmound = "";

	}
	
	
	
	
	public void setFeePeriod(String a){
		feePeriod = a;
	}
	
	public String getFeePeriod(){
		return feePeriod;
	}
		
	
	public void setFeeAmound(String a){
		feeAmound = a;
	}
	
	public String getFeeAmound(){
		return feeAmound;
	}
	

	
	
	
	
}
