package model;
import java.util.HashMap;
import java.util.Map;


public class OrderContainer {
	private static Map<Integer, Order> ordersByNo = new HashMap<>();
	
	
	private OrderContainer() {}


	public static void addOrder(Order o) {
		int orderNo = o.getOrderNo();
		ordersByNo.put(orderNo, o);
	}
}