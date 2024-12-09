package model;

import java.util.HashMap;
import java.util.Map;

public class CustomerContainer
{
	private static Customer anonymousCustomer = createAnonymous();
	private static Map<String, Customer> customerByPhone = new HashMap<>();
	private static Map<String, CustomerCategory> categoriesByName = new HashMap<>();
	
	
	private CustomerContainer()
	{
		
	}
	
	
	private  static Customer createAnonymous()
	{
		return new Customer();
	}
	
	
	public Customer getAnonymous()
	{
		return anonymousCustomer;
	}
	
	
	public static Customer findCustomerByPhone(String phone)
	{
		return customerByPhone.get(phone);
	}
}