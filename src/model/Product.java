package model;


public abstract class Product
{
	private String productID;
	private String model;
	

	/**
	 * 
	 */
	public Product() {
		
	}

	/** 
	 * Accessor for the full price of a product
	 * @return The price at which the product is to be sold (before customer discounts)
	 */
	public abstract double getPrice();

	
	public abstract double getMinimumPrice();
}