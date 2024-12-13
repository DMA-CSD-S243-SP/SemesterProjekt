// Packages
package model;

// Imports
import java.util.List;
import java.util.ArrayList;


/**
 * Represent a customer and what information it holds.
 *
 * @author Daniel Kryhlmand, Line Bertelsen & Christoffer Søndergaard
 * @version 13/12/2024 - 09:08
 */
public class Customer
{
	// Instance variables - Primitive Types
	private double discount;
	
	// Instance variables - Reference Types
	private String name;
	private String address;
	private String phone;
	private String mailAddress;
	private CustomerCategory category;
	private List<Order> orderList;
	
	
	/**
	 * Constructs a Customer instance with an empty list of 'Order' objects.
	 *
	 * Initializes a new 'Customer' object containing an collection in the form of
	 * an ArrayList of elements of the 'Order' type.
	 */
	public Customer()
	{
		this.orderList = new ArrayList<>();
	}
	
	
	/**
	 * Retrieves the discount that the customer should receive.
	 *
	 * Returns the value of the 'discount' field, which represents the percentage 
	 * amount of reduction in price this specific customer is entitled to for being 
	 * a good individual customer, and thereby should should have this discount 
	 * percentage applied to the products that they purchase.
	 *
	 * @return the value of the 'discount' field.
	 */
	public double getDiscount()
	{
		return discount;
	}
}