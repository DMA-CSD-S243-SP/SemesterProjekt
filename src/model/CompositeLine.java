package model;


public class CompositeLine
{
	private int quantity;
	
	private Product product;
	
	
	public CompositeLine(int quantity, Product lineProduct)
	{
		this.quantity = quantity;	
		this.product = lineProduct;	
	}
	

	public int getQuantity()
	{
		return this.quantity;
	}

	
	public Product getProduct()
	{
		return this.product;
	}
}