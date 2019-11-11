package creational.factory;

public class FactoryDemo {
	
	public static void main(String[] args) {
		Website blog = WebsiteFactory.getFactory("blog");
		System.out.println(blog);
		
		Website shop = WebsiteFactory.getFactory("shop");
		System.out.println(shop);
		
	}

}
