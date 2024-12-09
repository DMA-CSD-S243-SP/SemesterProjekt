package model;

public class SimpleProduct extends Product{
	private static final double MAXIMUMDISCOUNTMARGIN = 0.2; // The most a product is allowed to be discounted
	private String manufacturerName;
	private String manufacturerID;
	private double salesPrice;
	private double cost;
	private double msrp;
	
	/**
	 * Base case for getPrice. Simple implementation.
	 * @return salesPrice of Product
	 */
	@Override
	public double getPrice() {
		return salesPrice;
	}
	
	/**
	 * Base case for getMinimumPrice. Simple implementation.
	 * @return salesPrice * (1 - MAXIMUMDISCOUNTMARGIN) or cost. Whichever is higher.
	 */
	@Override
	public double getMinimumPrice() {
		double minimumPrice = salesPrice * (1 - MAXIMUMDISCOUNTMARGIN);
		if (minimumPrice < cost) {
			minimumPrice = cost;
		}
		return minimumPrice;
	}
	
	
}
