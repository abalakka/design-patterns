package creational.factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new Cart());
	}

	@Override
	public String toString() {
		return "Shop [pages=" + pages + "]";
	}

	
}
