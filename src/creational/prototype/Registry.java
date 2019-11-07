package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}

	//TODO implement type as enum
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setRunTime(100);
		movie.setPrice(10);
		movie.setTitle("Die Hard");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumOfPages(600);
		book.setPrice(60);
		book.setTitle("The Chamber");
		items.put("Book", book);
	}

}
