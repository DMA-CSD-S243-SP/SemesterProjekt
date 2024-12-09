package model;


public class CustomerCategory
{
	private String name; 
	private boolean locked;
	private double discount;
	private String description;
	
	
	public CustomerCategory(boolean isLocked, double discount, String description) 
	{
		locked = isLocked;
		this.discount = discount;
		this.description = description;
	}
	
	
	public boolean isLocked()
	{
		return locked;
	}
	
	public double getDiscount()
	{
		return discount;
	}
	
	public String getDescription()
	{
		return description;
	}
}