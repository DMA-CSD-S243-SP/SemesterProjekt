// Packages
package model;

// Imports
import java.util.HashMap;
import java.util.Map;


/**
 * Represents a Container for customers that includes a hashmap of customer and
 * of Category
 *
 * The CustomerContainer class is a container which holds both customers and
 * categories.
 * 
 * 
 * @author Anders Have & Christoffer Søndergaard
 * @version 12/12/2024 - 22:50
 */
public class CustomerContainer
{
	// Instance variables - Reference Types
	private static Map<String, Customer> customerByPhone = new HashMap<>();
	private static Map<String, CustomerCategory> categoriesByName = new HashMap<>();
	
	
	private static Customer anonymousCustomer = createAnonymous();

	/**
	 * The Constructor is private because of the singleton pattern
	 *
	 * Initializes a new CustomerContainer object.
	 */
	private CustomerContainer()
	{

	}

	/**
	 * creates a new Customer
	 *
	 * creates and returns a new customer.
	 *
	 * @return the new customer that was created
	 */
	private static Customer createAnonymous()
	{
		Customer anonymous = new Customer();
		customerByPhone.put("", anonymous);
		return anonymous;
	}

	/**
	 * Retrieves the anonymousCustomer field
	 *
	 * Returns the value of the 'anonymousCustomer' field, which is a customer.
	 *
	 * @return the anonymousCustomer field
	 */
	public Customer getAnonymous()
	{
		return anonymousCustomer;
	}

	/**
	 * Retrieves the customer
	 *
	 * Returns the value which the key(phone) is associated with from the HashMap
	 * customerByPhone.
	 *
	 * @return the value which the key(phone) is associated with.
	 */
	public static Customer findCustomerByPhone(String phone)
	{
		return customerByPhone.get(phone);
	}
}