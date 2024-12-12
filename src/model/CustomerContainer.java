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
 * @version 12/12/2024 - 23:06
 */
public class CustomerContainer
{
	// Instance variables - Reference Types
	private static Map<String, Customer> customerByPhone = new HashMap<>();
	private static Map<String, CustomerCategory> categoriesByName = new HashMap<>();
	
	
	private static Customer anonymousCustomer = createAnonymous();

	
	/**
	 * The constructor of this class is private, as it utilizes the singleton pattern.
	 *
	 * The constructor is used internally to initialize the singleton instance of the
	 * CustomerContainer class, thereby ensuring that no external instantiation of this
	 * class is possible.
	 *
	 * In order to access the single instance of the OrderContainer class, use getInstance().
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