// Packages
package model;

// Imports
import java.util.ArrayList;
import java.util.List;


/**
 * 
 *
 * 
 * 
 * 
 * 
 * 
 * @author Lumière Schack & Christoffer Søndergaard
 * @version 12/12/2024 - 22:38
 */
public class CompositeProduct extends Product
{
	private List<CompositeLine> compositeLineList;
	private double discount;

	
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