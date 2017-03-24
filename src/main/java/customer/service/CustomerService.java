package customer.service;

import java.util.List;

import customer.persistence.CustomerDTO;

public interface CustomerService {

	void delete(CustomerDTO customer);
	List<CustomerDTO> findAll();
	CustomerDTO find(Integer customer);
	CustomerDTO create(CustomerDTO customer);
	CustomerDTO update(CustomerDTO customer);
}
