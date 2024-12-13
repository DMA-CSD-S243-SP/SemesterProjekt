// Packages
package model;

// Imports
import java.util.HashMap;
import java.util.Map;


/**
 * Represents a container that 'Order' objects can be stored within and make them
 * easily accessible by using the 'Order' object's unique order number field's
 * value as the key used for retrieving said 'Order' objects stored within the collection.
 * The collection utilizes a HashMap, and allows for easy adding of Orders through its 
 * 'addOrder(order)' method.
 *
 * @author Daniel Kryhlmand, Line Bertelsen & Christoffer Søndergaard
 * @version 13/12/2024 - 10:19
 */
public class OrderContainer
{
	// Instance variables - Reference Types
	private static Map<Integer, Order> ordersByNo = new HashMap<>();

	
	/**
	 * The constructor of this class is private, as it utilizes the singleton pattern.
	 *
	 * The constructor is used internally to initialize the singleton instance of the
	 * OrderContainer class, thereby ensuring that no external instantiation of this
	 * class is possible.
	 *
	 * In order to access the single instance of the OrderContainer class, use getInstance().
	 */
	private OrderContainer()
	{

	}

	
	/**
	 * Adds an order to the HashMap collection of orders by their order number.
	 *
	 * The addOrder method retrieves the value stored in the 'orderNo' field of the
	 * associated 'Order' object and adds that order to the collection which uses a 
	 * HashMap and creates an association between the uniquely identifiable order number
	 * and the specific 'Order' object stored at this location within the HashMap.
	 *
	 * @param Order - The 'Order' object to add to store within the OrderContainer's HashMap collection.
	 */
	public static void addOrder(Order order)
	{
		// Retrieves the uniquely identifiable order number of the 'Order' object and store it within the orderNo variable
		int orderNo = order.getOrderNo();

		// Adds an 'Order' object to the HashMap's collection forming an association to the order's uniquely identifiable order number
		ordersByNo.put(orderNo, order);
	}
}