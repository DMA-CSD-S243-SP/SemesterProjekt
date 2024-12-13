// Packages
package model;

// Imports
import java.util.HashMap;
import java.util.Map;


/**
 * Represents a container that 'Customer' objects can be stored within and make them
 * easily accessible by using the 'Customer' object's unique phone field's value
 * as the key used for retrieving said 'Customer' objects stored within the collection.
 * The collection utilizes a HashMap for its collection.
 *
 * @author Anders Have & Christoffer Søndergaard
 * @version 13/12/2024 - 10:18
 */
public class CustomerContainer
{
	// Instance variables - Reference Types
	private static Map<String, Customer> customerByPhone = new HashMap<>();
	private static Map<String, CustomerCategory> categoriesByName = new HashMap<>();
	
	// Creates a Customer object and 
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
	 * Creates and adds a Customer object, to the HashMap's collection as an anonymous customer.
	 *
	 * Creates the 'Customer' object, and adds it to the HashMap's collection with an empty string
	 * as the associated 'Customer' objects key within the Hashmap, and gives the customer the
	 * name anonymousCustomer, to make it retrievable in situations where a customer is not to
	 * be registered in the system e.g. during regular sales.
	 * 
	 * @return the 'Customer' stored within the anonymousCustomer field.
	 */
	private static Customer createAnonymous()
	{
		// Creates a new customer object and stores it within the anonymous variable
		Customer anonymous = new Customer();
		
		// Adds the Customer to the HashMap collection by the name "anonymous". 
		// An anonymous customer will have an empty string as their phone number as they are anonymous.
		// The anonymous customer can be found in the system by the employee typing in nothing when assigning a customer to an order.
		customerByPhone.put("", anonymous);
		
		return anonymous;
	}

	
	/**
	 * Retrieves the value of the anonymousCustomer field.
	 *
	 * Returns the 'Customer' object, which is stored within the static
	 * anonymousCustomer field.
	 * 
	 * @return the 'Customer' stored within the anonymousCustomer field.
	 */
	public Customer getAnonymous()
	{
		return anonymousCustomer;
	}

	
	/**
	 * Retrieves the Customer object that has a matching phone number.
	 *
	 * Returns the 'Customer' object, which is stored within the HashMap collection
	 * with the specified phone number as their associated key.
	 *
	 * @return the 'Customer' which is associated with the key.
	 */
	public static Customer findCustomerByPhone(String phone)
	{
		return customerByPhone.get(phone);
	}
}