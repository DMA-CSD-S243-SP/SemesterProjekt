package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represent a customers order, and holds multiple order lines.
 * It provides functions to calculate the total and minimum total cost of an order.
 *
 * @author Line Bertelsen
 * @version 09/12/2024 - 12.54
 */


public class Order
{
	private List<OrderLine> orderLineList; 
	private LocalDate fillingData;
	private LocalDate orderDate;
	private int Status;
	private double discount;
	private int orderNo;
	private static int count;
	private Customer customer;
	
	
	/**
	 * Constructor initializes the order with an empty list of orderLine. 
	 */
	public Order()
	{
		orderLineList = new ArrayList<>();
	}
	
	
	/**
	 * Links a customer to the current 'Order' object.
	 * 
	 * @param customer    		-The customer who placed the order.
	 */
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	
	/**
	 * Adds an 'orderLine' to orderLineList.
	 * 
	 * @param orderLine	
	 */
	public void addOrderLine(OrderLine orderLine)
	{
		orderLineList.add(orderLine);		
	}
	
	
	/**
	 * Calculates the total cost of the order.
	 * 
	 * The getTotal method iterates through the list of order lines ('OrderLinesList').
	 * and sums up the subtotals of all order lines to compute the initial total. 
	 *  
	 * If-statement ensure the total is at least the minimum total
	 * 
	 * @return total price of the order
	 */
	public double getTotal()
	{
		double sum = 0;
		
		for (OrderLine orderLine : orderLineList)
		{
			sum = sum + orderLine.getSubTotal();
		}
		
		//Ensure the total is at least the minimum total
		if(getMinimumTotal() > sum) 
		{
			sum = getMinimumTotal();
		}
		
		return sum;
	}
	
	
	/**
	 * The getMinimumTotal method calculates the minimum total of the order.
	 * 
	 * @return the minimum total of order.
	 */
	private double getMinimumTotal()
	{
		double sum = 0;
		for (OrderLine orderLine : orderLineList)
		{
			sum = sum + orderLine.getMinimumSubtotal();
		}
		return sum;
	}
	
	
	/**
	 * Retrieves the unique order number for this order.
	 * 
	 * @return the order number
	 */
	public int getOrderNo()
	{
		return orderNo;
	}
}