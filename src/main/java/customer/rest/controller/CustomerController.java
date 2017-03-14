package customer.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import customer.persistence.CustomerRepository;
import customer.vo.Customer;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository customerService;
	
	@RequestMapping("/customer")
	public Customer create(@RequestParam(value="name")String customerName,@RequestParam(value="age")Double age) {
        return customerService.save(Customer.getBuilder()
        		.customerAge(age)
        		.customerName(customerName).build());
    }
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name")String customerName,@RequestParam(value="age")Double age) {
        return "hello "+customerName;
    }
}
