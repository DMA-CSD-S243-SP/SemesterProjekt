// Packages
package model;


/**
 * Represents a Category for customers that includes name of the category, the
 * discount the category gets, a description of the category and if its locked
 * or not
 *
 * The CustomerCategory class is a category which each customer is a part of, it
 * determines the discount they get when buying at the store.
 * 
 * 
 * @author Anders Have & Christoffer Søndergaard
 * @version 13/12/2024 - 08:52
 */
public class CustomerCategory
{
	// Instance variables - Primitive Types
	private boolean isLocked;
	private double discount;
	
	// Instance variables - Reference Types
	private String name;	
	private String description;
	

	/**
	 * Constructs a CustomerCategory instance with the specified isLocked, discount
	 * and description.
	 *
	 * Initializes a new CustomerCategory object with the given isLocked, discount
	 * and description. isLocked determines if the category is locked for use,
	 * discount is the discount which is associated with a category and description
	 * is a short text about the category.
	 *
	 * @param isLocked    - Determines if every employyee can add a customer to the category
	 * @param discount    - Specifies the percentage of discount offered to customers of this category
	 * @param description - The descriptive naming of this category
	 */
	public CustomerCategory(boolean isLocked, double discount, String description)
	{
		this.isLocked = isLocked;
		this.discount = discount;
		this.description = description;
	}

	
	/**
	 * Retrieves whether or not the category is locked.
	 *
	 * Returns the value of the "isLocked" field, which determines whether or not
	 * this category is accessible and possible to add a customer to by every employee
	 * in the company, or if it is only leaders.
	 * 
	 * @return true if the category is locked, else it returns false.
	 */
	public boolean isLocked()
	{
		if(isLocked == true)
		{
			return true;
		}
		
		return false;
	}

	
	/**
	 * Retrieves the discount that this category of customers should receive.
	 *
	 * Returns the value of the 'discount' field, which represents the percentage 
	 * amount of reduction in price this specific category of customers should have
	 * applied to the products that they purchase.
	 *
	 * @return the value of the 'discount' field
	 */
	public double getDiscount()
	{
		return discount;
	}

	
	/**
	 * Retrieves the description for the customer category.
	 *
	 * Returns the 'description' of the customer category. The 'description' field
	 * represents an elaborative and descriptive name for the specified type of 
	 * customer objects that are associated with the instance.
	 *
	 * @return a string containing the 'description' of the category.
	 */
	public String getDescription()
	{
		return description;
	}
}