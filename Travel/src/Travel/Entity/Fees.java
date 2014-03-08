
package Travel.Entity;

/**
 * @author 			George Chacko
 * Date				08 March 2014
 * Course			CMPP 264 Java workshop
 * Entity class		Fees 
 *
 */
public class Fees 
{
	/* private member variables - columns of Fees Table */
	private String FeeId ;
	private String FeeName ;
	private Double FeeAmount ;
	private String FeeDesc;
	
	/* empty constructor */
	public Fees()
	{
		
	}
	
	/* Getter and Setter methods for member variables */
	public String getFeeId() {
		return FeeId;
	}

	public void setFeeId(String feeId) {
		FeeId = feeId;
	}

	public String getFeeName() {
		return FeeName;
	}

	public void setFeeName(String feeName) {
		FeeName = feeName;
	}

	public Double getFeeAmount() {
		return FeeAmount;
	}

	public void setFeeAmount(Double feeAmount) {
		FeeAmount = feeAmount;
	}

	public String getFeeDesc() {
		return FeeDesc;
	}

	public void setFeeDesc(String feeDesc) {
		FeeDesc = feeDesc;
	}
	
	
}

