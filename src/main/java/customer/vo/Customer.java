package customer.vo;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	private Integer customerId;
	private String customerName;
	private Double customerAge;
	
	
	public Customer(CustomerBuilder customerBuilder) {
		this.customerId =customerBuilder.customerId;
		this.customerName = customerBuilder.customerName;
		this.customerAge=customerBuilder.customerAge;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerAge() {
		return customerAge;
	}


	public void setCustomerAge(Double customerAge) {
		this.customerAge = customerAge;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ "]";
	}
	
	static class CustomerBuilder {
		private Integer customerId;
		private String customerName;
		private Double customerAge;
	
		public CustomerBuilder customerId(Integer customerId){
			this.customerId=customerId;
			return this;
		}
		
		public CustomerBuilder customerName(String customerName){
			this.customerName=customerName;
			return this;
		}
		
		public CustomerBuilder customerAge(Double customerAge){
			this.customerAge=customerAge;
			return this;
		}
		
		public Customer build(){
			Customer customer = new Customer(this);
			return customer;
		}

	}
	
}
