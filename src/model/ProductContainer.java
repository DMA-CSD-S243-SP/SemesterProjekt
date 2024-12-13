// Packages
package model;

// Imports
import java.util.HashMap;
import java.util.Map;


/**
 * Represents a container that 'Product' objects can be stored within and make them
 * easily accessible by using the 'Product' object's unique productID field's value
 * as the key used for retrieving said 'Product' objects stored within the collection.
 * The collection utilizes a HashMap for its collection.
 *
 * @author Anders Have & Christoffer Søndergaard
 * @version 13/12/2024 - 10:24
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
	 * Retrieves the Product object that has a matching product ID.
	 *
	 * Returns the 'Product' object, which is stored within the HashMap collection
	 * with the specified product ID as their associated key.
	 *
	 * @return the 'Product' which is associated with the key.
	 */
	public static Product findProductByID(String productID)
	{
		return productByID.get(productID);
	}
}