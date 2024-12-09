package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class RentController here.
 *
 * @author Line Bertelsen
 * @version 0.0.1 initial draft version
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
	
	
	public Order()
	{
		orderLineList = new ArrayList<>();
	}
	
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	
	public void addOrderLine(OrderLine orderLine)
	{
		orderLineList.add(orderLine);		
	}
	
	
	public double getTotal()
	{
		double sum = 0;
		for (OrderLine orderLine : orderLineList)
		{
			sum = sum + orderLine.getSubTotal();
		}
		
		if(getMinimumTotal() > sum) 
		{
			sum = getMinimumTotal();
		}
		
		return sum;
	}
	
	
	private double getMinimumTotal()
	{
		double sum = 0;
		for (OrderLine orderLine : orderLineList)
		{
			sum = sum + orderLine.getMinimumSubtotal();
		}
		return sum;
	}
	
	
	public int getOrderNo()
	{
		return orderNo;
	}
}