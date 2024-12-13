// Packages
package model;


/**
 * Represent an order line containing a product and its respective quantity.
 *
 * @author Line Bertelsen & Christoffer Søndergaard
 * @version 13/12/2024 - 11:11
 */
public class OrderLine
{
	// Instance variables - Primitive Types
	private int quantity;
	
	// Instance variables - Reference Types
	private Product product;

	
	/**
	 * Constructs an 'OrderLine' object instance.
	 */
	public OrderLine()
	{

	}

	
	/**
	 * The setQuantity method sets the quantity for this order line.
	 * 
	 * The setQuantity method sets the quantity for this 'OrderLine' object instance's
	 * 'quantity' field, thereby specifying the amount of a 'Product' that is added
	 * to this line of the order.
	 * 
	 * @param quantity of the product
	 */
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	
	/**
	 * Sets a 'Product' object to be stored within this instance of the 'OrderLine' object's
	 * product field, thereby creating an association between this 'OrderLine' and the
	 * 'product' object that is being pointed at in the memory.
	 * 
	 * @param Product - The product that is added to this 'Orderline' instance.
	 */
	public void setProduct(Product product)
	{
		this.product = product;
	}

	
	/**
	 * The getSubTotal method calculates the subtotal of the quantity multiplied 
	 * by the product's price.
	 * 
	 * @return double - The subtotal for this order line.
	 */
	public double getSubTotal()
	{
		return quantity * product.getPrice();
	}

		
	/**
	 * The getMinimumSubtotal method calculates the minimum subtotal based on the
	 * products minimum price and returns the absolute minimum value of this line
	 * of the order.
	 * 
	 * @return double - The minimum subtotal for this order line.
	 */
	public double getMinimumSubtotal()
	{
		return quantity * product.getMinimumPrice();
	}
}