// Packages
package model;

// Imports
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Represent a customers order, and holds multiple order lines. It provides
 * functions to calculate the total and minimum total cost of an order.
 *
 * @author Line Bertelsen & Christoffer Søndergaard
 * @version 13/12/2024 - 10:54
 */
public class Order
{
	// Instance variables - Primitive Types
	private int Status;
	private int orderNo;
	private static int count;
	private double discount;
	
	// Instance variables - Reference Types
	private LocalDate fillingData;
	private LocalDate orderDate;	
	private Customer customer;
	private List<OrderLine> orderLineList;
	
	
	/**
	 * Constructs an Order instance with an empty list of 'OrderLine' objects.
	 *
	 * Initializes a new 'Order' object containing a collection in the form of
	 * an ArrayList of elements of the 'OrderLine' type.
	 */
	public Order()
	{
		orderLineList = new ArrayList<>();
	}

	
	/**
	 * Sets a 'Customer' object to be stored within this instance of the 'Order' object's
	 * customer field, thereby creating an association between this 'Order' and the
	 * 'Customer' object that is being pointed at in the memory.
	 * 
	 * @param Customer - The customer who placed the order.
	 */
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	
	/**
	 * Adds an 'Orderline' object to be stored within this instance of the 'Order' object's
	 * ArrayList collection.
	 * 
	 * @param Orderline - The 'Orderline' object that should be added to this 'Order' instance.
	 */
	public void addOrderLine(OrderLine orderLine)
	{
		orderLineList.add(orderLine);
	}
	

	/**
	 * Calculates the total cost of all the products associated with this 'Order' instance.
	 * 
	 * The getTotal method iterates through the ArrayList collection containing 'OrderLine' objects, 
	 * and adds each of the sub-totals together and returns a combined total cost for the entirety
	 * of the order.
	 * A minimum check is also added, to ensure that the price cannot fall below a set threshold.
	 * 
	 * @return Double - The total price of the entire order, after accounting for customer discount.
	 */
	public double getTotal()
	{
		double sum = 0;

		for (OrderLine orderLine : orderLineList)
		{
			sum = sum + orderLine.getSubTotal();
		}

		sum = sum * (1 - customer.getDiscount());

		// Ensure the total is at least the minimum total
		if (getMinimumTotal() > sum)
		{
			sum = getMinimumTotal();
		}

		return sum;
	}

	
	/**
	 * Calculates the absolute minimum price an order may ever be.
	 * 
	 * The getMinimumTotal method iterates through the ArrayList collection containing 'OrderLine' objects, 
	 * and adds each of their minimum subtotal price together and returns a combined total cost.
	 * 
	 * @return Double - The total minimum price of the entire order.
	 */
	private double getMinimumTotal()
	{
		double sum = 0;
		
		for (OrderLine orderLine : orderLineList)
		{
			sum = sum + orderLine.getMinimumSubtotal();
		}
		
		return sum;
	}

	
	/**
	 * Retrieves the order number of this 'Order' object instance.
	 *
	 * Returns the value of the 'orderNo' field, which represents the uniquely identifiable 
	 * order number of this specific order.
	 *
	 * @return Integer - The order number associated with this 'Order' object instance.
	 */
	public int getOrderNo()
	{
		return orderNo;
	}
}