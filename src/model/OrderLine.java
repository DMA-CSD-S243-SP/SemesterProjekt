package model;


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