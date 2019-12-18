package structural.flyweight;

public class Order {

	private final Item item;
	private final int orderNum;
	
	public Order(Item item, int orderNum) {
		this.item = item;
		this.orderNum = orderNum;
	}
	
	public void processOrder() {
		System.out.println("Ordering " + item + ". Order num: " + orderNum);
	}
	
}
