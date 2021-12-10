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
    /**
     * Fee constuctor, Initializes the values of fp and fa
     * with int values for feePeriod,fp, and feeAmount,fa,
     * @param fp parameter is a Type int and represents feePeriod 
     * @param fa parameter is a Type int and represents feeAmount 
     */
	public Fee(int fp, int fa) {
		feePeriod = fp;
		feeAmount = fa;
	}
    /**
	 * Fee Constructor, Initializes the values private varaiables of
     * feePeriod and feeAmount with a int value of 0
     */
	public Fee() {
		feePeriod = 0;
		feeAmount = 0;
	}
    /**
     * setFeePeriod method is a setter meathod, the private variables of
     * feePeriod is initilized with the value of feePeriod that is passed into the function
     * @param feePeriod, is a int type and is used to set the private variables of feePeriod
     */
	public void setFeePeriod(int feePeriod) {
		this.feePeriod = feePeriod;
	}
	/**
     * getFeePeriod method is a getter meathod, the private variables of
     * feePeriod is returned as a int value
     * @return
     */
	public int getFeePeriod() {
		return feePeriod;
	}
    /**
     * setFeeAmound method is a setter meathod, the private variables of
     * feeAmount is initilized with the value of feeAmount that is passed into the function
     * @param feeAmount, is a int type and is used to set the private variables of feeAmount
     */
	public void setFeeAmound(int feeAmount) {
		this.feeAmount = feeAmount;
	}
	/**
     * getFeeAmount method is a getter meathod, the private variables of
     * feeAmount is returned as a int value
     * @return
     */
	public int getFeeAmount() {
		return feeAmount;
	}

}
