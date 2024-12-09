package model;

/**
 * Write a description of class RentController here.
 *
 * @author Line Bertelsen
 * @version 0.0.1 initial draft version
 */


public class OrderLine
{
	private int quantity;
	private Product product;
	
	
	public OrderLine() 
	{
		
	}
		
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	

	public void setP(Product product)
	{
		this.product = product; 
	}
	
	
	public double getSubtotal()
	{
		return quantity * product.getPrice();
	}
	
	
	public double getMinimumSubtotal()
	{
		return quantity * product.getMinimumPrice();
	}
}