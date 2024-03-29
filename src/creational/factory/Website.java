package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}

	public abstract void createWebsite();

	public List<Page> getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "Website [pages=" + pages + "]";
	}
	
	
}
