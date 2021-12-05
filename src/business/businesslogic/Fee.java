

public class Fee {
	
	private int feePeriod;
	private int feeAmound;
	
	// fp stands for feePeriod
	// fa stands for fee Amound
	public Date(int fp, int fa){
		feePeriod = fp;
		feeAmound = fa;

	}
			
	public Date(){
		feePeriod = "";
		feeAmound = "";

	}
	
	
	
	
	public void setFeePeriod(int a){
		feePeriod = a;
	}
	
	public int getFeePeriod(){
		return feePeriod;
	}
		
	
	public void setFeeAmound(int a){
		feeAmound = a;
	}
	
	public int getFeeAmound(){
		return feeAmound;
	}
	

	
	
	
	
}
