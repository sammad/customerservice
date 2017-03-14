package customer.service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO find(Integer customer) {
		// TODO Auto-generated method stub
		return null;
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

}
