package creational.factory;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new Post());
		pages.add(new About());
	}

	@Override
	public String toString() {
		return "Blog [pages=" + pages + "]";
	}

	
}
