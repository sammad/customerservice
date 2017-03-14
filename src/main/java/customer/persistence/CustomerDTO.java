package customer.persistence;

public class CustomerDTO {

	private Integer customerID;
	private String customerName;
	private Double customerAge;
	
	public CustomerDTO(Integer customerID, String customerName, Double customerAge) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
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
