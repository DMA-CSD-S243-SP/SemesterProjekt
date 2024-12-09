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
	
	
public Customer(String name, String address, String phone, String mailAddress, double discount, List<Order> orderList, CustomerCategory category) {	
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.mailAddress = mailAddress;
	this.discount = discount;
	this.orderList = new ArrayList<>();
	this.category = category;
}


public double getDiscount() {
	return discount;
}
}