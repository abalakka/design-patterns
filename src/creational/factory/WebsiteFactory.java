package creational.factory;

public class WebsiteFactory {
	
	// TODO : type as enum
	public static Website getFactory(String type) {
		switch(type) {
			case "blog" :
				return new Blog();
			case "shop" :
				return new Shop();
			default:
				return null;
		}
	}
}
