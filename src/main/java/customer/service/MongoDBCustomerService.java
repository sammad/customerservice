package customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import customer.persistence.CustomerDTO;
import customer.persistence.CustomerRepository;
import customer.vo.Customer;

@Component
public class MongoDBCustomerService implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void delete(CustomerDTO customer) {
		

	}

	@Override
	public List<CustomerDTO> findAll() {
		return convertToDTOList(customerRepository.findAll());
	}

	@Override
	public CustomerDTO find(Integer customerId) {
		return convertToDTO(customerRepository.findOne(customerId));
	}

	@Override
	public CustomerDTO create(CustomerDTO customerDTO) {
		Customer customer=Customer.getBuilder()
									.customerId(customerDTO.getCustomerID())
									.customerAge(customerDTO.getCustomerAge())
									.customerName(customerDTO.getCustomerName()).build();
		return convertToDTO(customerRepository.save(customer));
	}

	private CustomerDTO convertToDTO(Customer customer) {
		return new CustomerDTO(customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerAge());
	}
	
	private List<CustomerDTO> convertToDTOList(List<Customer> customers) {
		List<CustomerDTO> customerDTOs =new ArrayList<>();
		customers.stream().forEach(customer->customerDTOs.add(new CustomerDTO(customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerAge())));
		return customerDTOs;
	}

}
