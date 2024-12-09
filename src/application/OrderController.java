package application;

import model.Customer;
import model.Order;
import model.OrderContainer;
import model.OrderLine;
import model.Product;

/**
 * Class responsible for interactions with OrderContainer, Order, and OrderLine classes and instances.
 */
public class OrderController
{
	private Order order;
	
	/**
	 * Constuctor for OrderController instances.
	 */
	public OrderController() {
		
	}
	
	/**
	 * Creates an empty order, and stores it locally.
	 */
	public void makeNewOrder() {
		order = new Order();
		
	}
	
	/**
	 * Finds a customer by the given phonenumber, and adds them to the order.
	 * @param phone - the phone number of the customer
	 * @return the customer that the phonenumber corresponds to.
	 */
	public Customer addCustomerByPhoneNumber(String phone) {
		Customer customer = new CustomerController().findCustomerByPhone(phone);
		order.setCustomer(customer);
		return customer;
	}
	
	/**
	 * Adds an OrderLine to the order, by finding a product that matched the product ID.
	 * @param productID
	 * @param quantity
	 * @return the total price of the order, calculated after the current line has been added.
	 * @throws nullPointerException if given productID doesn't match any Product in the system.
	 */
	public double enterProduct(String productID, int quantity) {
		OrderLine orderLine = new OrderLine();
		Product product = new ProductController().findProductByID(productID); // Throws null pointer if Product isn't found.
		orderLine.setProduct(product);
		orderLine.setQuantity(quantity);
		order.addOrderLine(orderLine);
		return order.getTotal();
	}
	
	/**
	 * Adds the current order to the OrderContainer. Clears order as an ecapsulation measure.
	 */
	public void endSale() {
		OrderContainer.addOrder(order);
		order = null;
	}
}