// Packages
package model;

// Imports
import java.util.HashMap;
import java.util.Map;


/**
 * Represent a Container for orders what includes a hashmap.
 *
 * @author Daniel Kryhlmand, Line Bertelsen
 * @version 10/12/2024 - 13:30
 */
public class OrderContainer
{
	private static Map<Integer, Order> ordersByNo = new HashMap<>();

	/**
	 * Private constructor to prevent instantiation of this class.
	 */
	private OrderContainer()
	{

	}

	/**
	 * The addOrder method adds an Order to the collection.
	 * 
	 * o.getOrderNo retrieves the order number from the Order object.
	 * ordersByNo.put(orderNo, o) adds the Order to the map with its order number as
	 * they key.
	 * 
	 * @param o the Order object to add the collection.
	 */
	public static void addOrder(Order o)
	{
		int orderNo = o.getOrderNo();
		ordersByNo.put(orderNo, o);
	}
}