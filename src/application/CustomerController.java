package application;

import model.Customer;
import model.CustomerContainer;

/**
 * Represent a Controller for customer its responsible for handling
 * customer-related operations.
 * 
 * It acts as a mediator between the higher-level application and the underlying
 * data storage or business logic.
 *
 * @author Daniel Kryhlmand, Line Bertelsen
 * @version 10/12/2024 - 13:50
 */

public class CustomerController
{

	public CustomerController()
	{

	}

	/**
	 * The findCustomerByPhone() method finds a customer based on their phone
	 * number.
	 * 
	 * It delegates the actual search to the CustomerContainer class and ensures the
	 * controller does not handle data storage directly.
	 * 
	 * @param phone - the phone number of the customer that needs to be found
	 * @return customer - Customer object that match the given phone number or
	 *         return null if no customer is found.
	 */
	public Customer findCustomerByPhone(String phone)
	{
		return CustomerContainer.findCustomerByPhone(phone);
	}
}