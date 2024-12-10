package application;
import model.Product;
import model.ProductContainer;

/**
 * Represent a Controller for product its responsible for handling product-related operations.
 * 
 * It acts as a mediator between the higher-level application and the underlying
 * data storage or business logic.
 *
 * @author Lumière Schack, Line Bertelsen
 * @version 10/12/2024 - 14:10
 */

public class ProductController 
{
	public ProductController() 
	{
		
	}
	
	
	/**
	 * The findProductByID() method finds a product based on their product ID.
	 * 
	 * It delegates the actual search to the ProductContainer class
	 * and ensures the controller does not handle data storage directly. 
	 * 
	 * @param product ID 	 - the product ID of the product that needs to be found
	 * @return customer	 	 - Product object that match the given product ID
	 * 						   or return null if no product is found.
	 */
	public Product findProductByID(String productID) 
	{
		return ProductContainer.findProductByID(productID);
	}
	
}