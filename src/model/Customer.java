// Packages
package model;

// Imports
import java.util.List;
import java.util.ArrayList;


/**
 * Represent a customer and what information it holds.
 *
 * @author Daniel Kryhlmand, Line Bertelsen & Christoffer Søndergaard
 * @version 12/12/2024 - 22:50
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
	 * Constructor initializes the order with an empty list of orderList.
	 */
	public Customer()
	{
		this.orderList = new ArrayList<>();
	}

	/**
	 * The getDiscount method retrieves the current discount value.
	 * 
	 * @return the current discount value as a double.
	 */
	public double getDiscount()
	{
		return discount;
	}
}