package structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<>();
	
	void takeOrder(String itemName, int orderNum) {
		Item item = catalog.lookUp(itemName);
		Order order = new Order(item, orderNum);
		orders.add(order);
	}
	
	void process() {
		for(Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	
	String report() {
		return "Total items made: " + catalog.totalItemsMade();
	}

}
