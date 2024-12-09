package application;

import model.Customer;
import model.Order;
import model.OrderContainer;
import model.OrderLine;
import model.Product;

public class OrderController
{
	private Order o;
	
	/**
	 * Constuctor for OrderController instances.
	 */
	public OrderController() {
		
	}
	
	/**
	 * Creates an empty order, and stores it locally.
	 */
	public void makeNewOrder() {
		o = new Order();
		
	}
	
	/**
	 * Finds a customer by the given phonenumber, and adds them to the order.
	 * @param phone - the phone number of the customer
	 * @return the customer that the phonenumber corresponds to.
	 */
	public Customer addCustomerByPhoneNumber(String phone) {
		Customer c = new CustomerController().findCustomerByPhone(phone);
		o.setCustomer(c);
		return c;
	}
	
	/**
	 * Adds an OrderLine to the order, by finding a product that matched the product ID.
	 * @param productID
	 * @param quantity
	 * @return the total price of the order, calculated after the current line has been added.
	 * @throws nullPointerException if given productID doesn't match any Product in the system.
	 */
	public double enterProduct(String productID, int quantity) {
		OrderLine ol = new OrderLine();
		Product p = new ProductController().findProductByID(productID); // Throws null pointer if Product isn't found.
		ol.setProduct(p);
		ol.setQuantity(quantity);
		o.addOrderLine(ol);
		return o.getTotal();
	}
	
	/**
	 * Adds the current order to the OrderContainer. Clears o as an ecapsulation measure.
	 */
	public void endSale() {
		OrderContainer.addOrder(o);
		o = null;
	}
}