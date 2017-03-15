package customer.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import customer.persistence.CustomerDTO;
import customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path="/customer", method=RequestMethod.PUT)
	public CustomerDTO create(@RequestParam(value="name")String customerName,@RequestParam(value="age")Double age) {
        return customerService.create(new CustomerDTO(customerName,age));
    }
	@RequestMapping(path="/customer", method=RequestMethod.GET)
	public CustomerDTO findCustomer(@RequestParam(value="name")String customerName){
		CustomerDTO customerDTO=null;
		List<CustomerDTO> customers=customerService.findAll();
		for(CustomerDTO customer:customers){
			if(customer.getCustomerName().equals(customerName)){
				customerDTO=customer;
			}
		}
		return customerDTO;
	}
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name")String customerName) {
        return "hello "+customerName;
    }
}
