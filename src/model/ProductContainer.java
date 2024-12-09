package model;

import java.util.HashMap;
import java.util.Map;

public class ProductContainer
{
	private static Map<String, Product> productByID = new HashMap<>();
	
	
	private ProductContainer()
	{
		
	}
	
	
	public static Product findProductByID(String productID)
	{
		return productByID.get(productID);
	}
}