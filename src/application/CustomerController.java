package application;

import model.Customer;
import model.CustomerContainer;


public class CustomerController {
	
	
	public CustomerController() {}
	
	
	public Customer findCustomerByPhone(String phone) {
		return CustomerContainer.findCustomerByPhone(phone);
	}
}