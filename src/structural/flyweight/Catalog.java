package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private Map<String, Item> items = new HashMap<>();
	
	public Item lookUp(String itemName) {
		items.computeIfAbsent(itemName, name -> new Item(name));
		return items.get(itemName);
	}
	
	public int totalItemsMade() {
		return items.size();
	}
}
