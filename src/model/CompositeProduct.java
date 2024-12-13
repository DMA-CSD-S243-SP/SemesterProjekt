// Packages
package model;

// Imports
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a product composed of other products, potentially other
 * CompositeProducts. A CompositeProduct object does not have a sales price of
 * its own. Instead it used the getPrice method recursively to calculate the
 * price whenever it's needed.
 *
 * @author Lumière Schack & Christoffer Søndergaard
 * @version 13/12/2024 - 10:55
 */
public class CompositeProduct extends Product
{
	// Instance variables - Primitive Types
	private double discount;

	// Instance variables - Reference Types
	private List<CompositeLine> compositeLineList;

	/**
	 * Constructs a composite product.
	 */
	public CompositeProduct()
	{
		super();
		compositeLineList = new ArrayList<>();
	}

	/**
	 * Accessor for the total price of a compositeProduct
	 * 
	 * @return The total price of the compositeProduct
	 */
	@Override
	public double getPrice()
	{
		double sum = 0;

		for (CompositeLine currentLine : compositeLineList)
		{
			Product currentProduct = currentLine.getProduct();
			sum = sum + (currentProduct.getPrice() * currentLine.getQuantity());
		}

		return sum;
	}

	/**
	 * Accessor for the total minimum price of a compositeProduct
	 * 
	 * @return The total minimum price of the compositeProduct
	 */
	@Override
	public double getMinimumPrice()
	{
		double sum = 0;

		for (CompositeLine currentLine : compositeLineList)
		{
			Product currentProduct = currentLine.getProduct();
			sum = sum + (currentProduct.getMinimumPrice() * currentLine.getQuantity());
		}

		return sum;
	}
}