package customer.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import customer.vo.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

	/*void deletebyCustomerId(Customer customer);
	List<Customer> findAll();
	Customer findByCustomerId(Integer customer);*/
}
