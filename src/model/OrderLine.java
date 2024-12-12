// Packages
package model;


/**
 * Represent an order line containing a product and its quantity.
 *
 * @author Line Bertelsen & Christoffer Søndergaard
 * @version 12/12/2024 - 22:50
 */
public class OrderLine
{
	// Instance variables - Primitive Types
	private int quantity;
	
	// Instance variables - Reference Types
	private Product product;

	
	public OrderLine()
	{

	}

	
	/**
	 * The setQuantity method sets the quantity for this order line.
	 * 
	 * @param quantity of the product
	 */
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	
	/**
	 * The setProduct method set the product for this order line.
	 * 
	 * @param product
	 */
	public void setProduct(Product product)
	{
		this.product = product;
	}

	
	/**
	 * The getSubTotal method calculates the subtotal based on the products price.
	 * 
	 * @return the subtotal of this order line.
	 */
	public double getSubTotal()
	{
		return quantity * product.getPrice();
	}

	
	/**
	 * The getMinimumSubtotal method calculates the minimum subtotal based on the
	 * products minimum price.
	 * 
	 * @return the minimum subtotal for this order line.
	 */
	public double getMinimumSubtotal()
	{
		return quantity * product.getMinimumPrice();
	}
}