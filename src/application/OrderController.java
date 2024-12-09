package application;

import model.Customer;
import model.Order;
import model.OrderContainer;
import model.OrderLine;
import model.Product;

public class OrderController
{
	private Order o;
	
	
	public OrderController() {
		
	}
	
	public void makeNewOrder() {
		o = new Order();
		
	}
	
	public Customer addCustomerByPhoneNumber(String phone) {
		Customer c = new CustomerController().findCustomerByPhone(phone);
		o.setCustomer(c);
		return c;
	}
	
	public double enterProduct(String productID, int quantity) {
		OrderLine ol = new OrderLine();
		Product p = new ProductController().findProductByID(productID);
		ol.setProduct(p);
		ol.setQuantity(quantity);
		o.addOrderLine(ol);
		return o.getTotal();
	}
	
	public void endSale() {
		OrderContainer.addOrder(o);
	}
}