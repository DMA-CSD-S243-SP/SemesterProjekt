package model;


/**
 * Represents a Category for customers that includes name of the category, the discount the category gets,
 * a description of the category and if its locked or not
 *
 * The CustomerCategory class is a category which each customer is a part of, it determines the discount they get when buying at the store.
 * 
 * 
 * @author Anders Have
 * @version 09/12/2024 - 10:05
 */
public class CustomerCategory
{
	private String name; 
	private boolean locked;
	private double discount;
	private String description;
	
	
	/**
	 * Constructs a CompositeLine instance with the specified quantity and product.
	 *
	 * Initializes a new CompositeLine object with the given quantity and associated product.
	 * The quantity represents the number of items, and the lineProduct represents the product associated with this line.
	 *
	 * @param isLocked    			- 
	 * @param discount  			- the discount associated with the category
	 * @param description 			- The description of the category
	 */
	public CustomerCategory(boolean isLocked, double discount, String description) 
	{
		locked = isLocked;
		this.discount = discount;
		this.description = description;
	}
	
	
	/**
	 * Retrieves if the category is locked.
	 *
	 * Returns the value of the 'locked' field, which represents if
	 * the category is locked or not.
	 *
	 * @return if the category is locked or not
	 */
	public boolean isLocked()
	{
		return locked;
	}
	
	
	/**
	 * Retrieves the discount.
	 *
	 * Returns the value of the 'discount' field, which represents the
	 * 'discount' of the object associated with the instance.
	 *
	 * @return the value of the discount field
	 */
	public double getDiscount()
	{
		return discount;
	}
	
	
	/**
	 * Retrieves the description.
	 *
	 * Returns the value of the 'description' field, which represents the
	 * 'description' of the object associated with the instance.
	 *
	 * @return the value of the description field
	 */
	public String getDescription()
	{
		return description;
	}
}