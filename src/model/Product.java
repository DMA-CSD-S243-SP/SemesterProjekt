package model;


public class Product
{
	private double salesPrice;
	private double cost;
	private double msrp;
	
	private String productID;
	private String manufacturerName;
	private String manufacturerID;
	private String model;
	
	
	public Product(String productID, String manufacturerName, String manufacturerID, String model, double salesPrice, double cost, double msrp)
	{
		this.productID = productID;
		this.manufacturerName = manufacturerName;
		this.manufacturerID = manufacturerID;
		this.model = model;
		
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.msrp = msrp;
	}


	public double getPrice()
	{
		
		return 0.0;
	}

	
	public double getMinimumPrice()
	{
		
		return 0.0;
	}
}