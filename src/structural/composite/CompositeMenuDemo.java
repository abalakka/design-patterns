package structural.composite;

public class CompositeMenuDemo {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("main", "/main");

		MenuItem safetyMenuItem = new MenuItem("safety", "/safe");
		MenuItem claimsMenuItem = new MenuItem("claims", "/claim");

		mainMenu.add(safetyMenuItem);
		mainMenu.add(claimsMenuItem);

		System.out.println(mainMenu.toString());

	}

}
