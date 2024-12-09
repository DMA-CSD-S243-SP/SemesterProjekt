package model;
import java.util.List;
import java.util.ArrayList;


public class Customer {
	private String name;
	private String address;
	private String phone;
	private String mailAddress;
	private double discount;
	private List<Order> orderList;
	private CustomerCategory category;
	
	
public Customer() {	
	this.orderList = new ArrayList<>();
}


public double getDiscount() {
	return discount;
}
}