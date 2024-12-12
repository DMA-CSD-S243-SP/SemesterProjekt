// Packages
package model;

// Imports
import java.util.HashMap;
import java.util.Map;


/**
 * Represents a Container Products that includes a hashmap of Products
 *
 * The CustomerContainer class is a container which holds both customers and
 * categories.
 * 
 * 
 * @author Anders Have & Christoffer Søndergaard
 * @version 12/12/2024 - 23:06
 */
public class ProductContainer
{
	// Instance variables - Reference Types
	private static Map<String, Product> productByID = new HashMap<>();

	
	/**
	 * The constructor of this class is private, as it utilizes the singleton pattern.
	 *
	 * The constructor is used internally to initialize the singleton instance of the
	 * ProductContainer class, thereby ensuring that no external instantiation of this
	 * class is possible.
	 *
	 * In order to access the single instance of the OrderContainer class, use getInstance().
	 */
	private ProductContainer()
	{

	}

	
	/**
	 * Retrieves the product
	 *
	 * Returns the value which the key(productID) is associated with from the
	 * HashMap productByID.
	 *
	 * @return the value which the key(productID) is associated with.
	 */
	public static Product findProductByID(String productID)
	{
		return productByID.get(productID);
	}
}