package customer.service;

import java.util.List;

import org.springframework.data.rest.core.annotation.RestResource;

import customer.persistence.CustomerDTO;
@RestResource(path="/customers",rel="/customers")
public interface CustomerService {

	void delete(CustomerDTO customer);
	List<CustomerDTO> findAll();
	CustomerDTO find(Integer customer);
	CustomerDTO create(CustomerDTO customer);
	CustomerDTO update(CustomerDTO customer);
}
