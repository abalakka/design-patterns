package structural.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		InventorySystem inventory = new InventorySystem();
		
		inventory.takeOrder("BOSE", 111);
		inventory.takeOrder("SENH", 221);
		inventory.takeOrder("SKULL", 133);
		inventory.takeOrder("BOSE", 445);
		
		inventory.process();
		
		System.out.println(inventory.report());
	}
}
