package model;


/**
 * Represents a simple product, containing pricing and manufacturer details.
 *
 * The 'SimpleProduct' class extends the 'Product' class, and provides a way to retrieve the
 * product's price, and minimum price. Also includes information about the manufacturer and pricing
 * and the manufacturer's suggested retail price (MSRP).
 * Used in every context that involves a product association, as it is a generalization of the 
 * product class.
 * 
 * 
 * @author Lumière Schack & Christoffer Søndergaard
 * @version 09/12/2024 - 12:03
 */
public class SimpleProduct extends Product
{
	// Instance variables - Primitive Types
	private double salesPrice;
	private double cost;
	private double msrp;

	// The most a product is allowed to be discounted
	private static final double MAXIMUMDISCOUNTMARGIN = 0.2;
	
	// Instance variables - Reference Types
	private String manufacturerName;
	private String manufacturerID;


	/**
	 * Retrieves the price of a product.
	 * 
	 * This is a base implementation of the getPrice method.
	 * Returns the value of the 'salesPrice' field, which represents the
	 * 'salesPrice' of the 'Product' instance.
	 *
	 * @return the value of the salesPrice field of a Product
	 */
	@Override
	public double getPrice()
	{
		return salesPrice;
	}
	
	
	/**
	 * Retrieves the minimum price of a product.
	 * 
	 * This is a base implementation of the getMinimumPrice method.
	 * Returns the highest value of either 'salesPrice * (1 - MAXIMUMDISCOUNTMARGIN)' or the cost field, 
	 * depending on whichever is higher.
	 *
	 * @return the value of the salesPrice field of a Product
	 */
	@Override
	public double getMinimumPrice()
	{
		double minimumPrice = salesPrice * (1 - MAXIMUMDISCOUNTMARGIN);
		
		if (minimumPrice < cost)
		{
			minimumPrice = cost;
		}
		
		return minimumPrice;
	}
}
