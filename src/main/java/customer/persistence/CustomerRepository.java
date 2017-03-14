package customer.persistence;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import customer.vo.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

	/*void deleteCustomer(Customer customer);
	List<Customer> findAllCustomer();
	Customer findCustomer(Integer customer);*/
	/*Customer createCustomer(Customer customer);*/
}
