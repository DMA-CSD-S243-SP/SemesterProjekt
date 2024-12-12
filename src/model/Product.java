// Packages
package model;


/**
 * Represents an abstract base class for a product, containing pricing details.
 *
 * The 'Product' class is an abstract class, meaning it serves as a blueprint
 * for other product-related classes that are an extension of this super class
 * and inherits from it. The 'Product' class implements abstract methods for
 * getPrice and getMinimumPrice, which are used by its subclasses
 * 'SimpleProduct', and 'CompositeProduct'.
 * 
 * 
 * @author Lumière Schack & Christoffer Søndergaard
 * @version 09/12/2024 - 13:05
 */
public abstract class Product
{
	// Instance variables - Reference Types
	private String productID;
	private String model;

	/**
	 * Constructs a 'Product' instance, that cannot be instantiated on its own as it
	 * is an abstract class.
	 *
	 * Subclasses of 'Product' can extend upon this constructor to add additional
	 * initialization logic. The subclass 'SimpleProduct' and 'CompositeProduct'
	 * extends upon this 'Product' superclass.
	 */
	public Product()
	{

	}

	/**
	 * Retrieves the price at which a product is to be sold at, before customer
	 * discounts are factored in.
	 * 
	 * The abstract getPrice method returns the price of a product before any
	 * customer discounts are factored in to the pricing. If a product consists of
	 * multiple other products e.g. a kitchen or bathroom, then the price of the
	 * entire product, total sum of all sub products, is the price that is
	 * retrieved.
	 * 
	 * @return the selling price of a product, before customer discounts are
	 *         applied.
	 */
	public abstract double getPrice();

	/**
	 * Retrieves the minimum price of a product.
	 * 
	 * The abstract getMinimumPrice method returns the minimum price of a product.
	 * If a product consists of multiple other products e.g. a kitchen or bathroom,
	 * then the minimum price of the entire product, total sum of all sub products,
	 * is the minimum price that is retrieved.
	 * 
	 * @return minimum price of a product.
	 */
	public abstract double getMinimumPrice();
}