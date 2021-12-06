package business.businesslogic;

public class Fee {
	
	private int feePeriod;
	private int feeAmound;
	
	
	public Fee(int fp, int fa){
		feePeriod = fp;
		feeAmound = fa;
	}
	
	public void setFeePeriod(int feePeriod){
		this.feePeriod = feePeriod;
	}
	
	public int getFeePeriod(){
		return feePeriod;
	}
		
	
	public void setFeeAmound(int feeAmount){
		this.feeAmound = feeAmount;
	}
	
	public int getFeeAmound(){
		return feeAmound;
	}
	

	
	
	
	
}
