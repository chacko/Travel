package Travel.Entity;

public class Customers {
	private String customerFirstName;
	private String customerLastName;
	private Integer customerID;
	
	public Customers(){
		
	}
	
	public Customers(String customerFirstName, String customerLastName, Integer customerID) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerID = customerID;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer agentId) {
		this.customerID = agentId;
	}

	@Override
	public String toString() {
		//if(this.customerLastName)
		return this.customerFirstName + " " + this.customerLastName;
	}
}
