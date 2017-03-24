package customer.rest.controller;

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
	public CustomerDTO findCustomerByID(@RequestParam(value="id")Integer customerId){
		CustomerDTO customerDTO=customerService.find(customerId);
		return customerDTO;
	}
	
	@RequestMapping(path="/customer", method=RequestMethod.DELETE)
	public CustomerDTO deleteCustomerByID(@RequestParam(value="id")Integer customerId){
		CustomerDTO customerDTO=customerService.find(customerId);
		if(customerDTO!=null){
			customerService.delete(customerDTO);
			return customerDTO;
		}else{
			return null;
		}
		
	}
	
	@RequestMapping(path="/customer", method=RequestMethod.POST)
	public CustomerDTO updateCustomer(@RequestParam(value="id")Integer customerId,@RequestParam(value="name")String name,@RequestParam(value="age")Double age){
		CustomerDTO customerDTO=customerService.find(customerId);
		customerDTO.setCustomerAge(age);
		customerDTO.setCustomerName(name);
		customerDTO=customerService.update(customerDTO);
		return customerDTO;
	}
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name")String customerName) {
        return "hello "+customerName;
    }
}
