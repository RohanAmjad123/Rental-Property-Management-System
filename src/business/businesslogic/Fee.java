package business.businesslogic;

/**
 * Class Fee
 * 
 * @since December 4th, 2021
 * @author Rohan Amjad
 * @version 1.0
 */
public class Fee {

	private int feePeriod;
	private int feeAmount;

	public Fee(int fp, int fa) {
		feePeriod = fp;
		feeAmount = fa;
	}

	public Fee() {
		feePeriod = 0;
		feeAmount = 0;
	}

	public void setFeePeriod(int feePeriod) {
		this.feePeriod = feePeriod;
	}

	public int getFeePeriod() {
		return feePeriod;
	}

	public void setFeeAmound(int feeAmount) {
		this.feeAmount = feeAmount;
	}

	public int getFeeAmount() {
		return feeAmount;
	}

}
