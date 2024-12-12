// Packages
package model;

// Imports
import java.util.List;
import java.util.ArrayList;


/**
 * Represent a customer and what information it holds.
 *
 * @author Daniel Kryhlmand, Line Bertelsen
 * @version 10/12/2024 - 13:00
 */

public class Customer
{
	private String name;
	private String address;
	private String phone;
	private String mailAddress;
	private double discount;
	private List<Order> orderList;
	private CustomerCategory category;

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