package application;

import model.Product;
import model.ProductContainer;

public class ProductController 
{
	public ProductController() {
		
	}
	
	public Product findProductByID(String productID) {
		return ProductContainer.findProductByID(productID);
	}
	
}