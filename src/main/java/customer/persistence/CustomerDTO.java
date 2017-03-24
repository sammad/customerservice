package customer.persistence;

public class CustomerDTO {

	private Integer customerID;
	private String customerName;
	private Double customerAge;
	
	public CustomerDTO(String customerName, Double customerAge) {
		super();
		this.customerName = customerName;
		this.customerAge = customerAge;
	}

	public CustomerDTO(Integer customerID, String customerName, Double customerAge) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAge(Double customerAge) {
		this.customerAge = customerAge;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getCustomerAge() {
		return customerAge;
	}
	
}
