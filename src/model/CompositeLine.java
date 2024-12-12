// Packages
package model;


/**
 * Represents a composite line that includes a quantity of a specific product.
 *
 * The CompositeLine class models an association between a product and its
 * quantity, used in the context of working with products consisting of multiple
 * sub-products.
 * 
 * 
 * @author Christoffer Søndergaard
 * @version 09/12/2024 - 11:06
 */
public class CompositeLine
{
	// Instance variables - Primitive Types
	private int quantity;

	// Instance variables - Reference Types
	private Product product;

	/**
	 * Constructs a CompositeLine instance with the specified quantity and product.
	 *
	 * Initializes a new CompositeLine object with the given quantity and associated
	 * product. The quantity represents the number of items, and the lineProduct
	 * represents the product associated with this line.
	 *
	 * @param quantity    - The quantity of the products in this line.
	 * @param lineProduct - The product associated with this line.
	 */
	public CompositeLine(int quantity, Product lineProduct)
	{
		this.quantity = quantity;
		this.product = lineProduct;
	}

	/**
	 * Retrieves the quantity.
	 *
	 * Returns the value of the 'quantity' field, which represents the 'quantity' of
	 * the object associated with the instance.
	 *
	 * @return the value of the quantity field
	 */
	public int getQuantity()
	{
		return this.quantity;
	}

	/**
	 * Retrieves the product associated with this instance.
	 *
	 * Returns the 'product' object, which represents the specific 'product'
	 * associated with the current instance.
	 *
	 * @return the 'product' associated with this instance
	 */
	public Product getProduct()
	{
		return this.product;
	}
}