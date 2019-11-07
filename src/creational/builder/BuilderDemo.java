package creational.builder;

import creational.builder.LunchOrder.Builder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		Builder builder = new LunchOrder.Builder();
		
		builder.bread("wheat").dressing("mayo");
		
		LunchOrder order = builder.build();
		
		System.out.println(order);
		
		builder.clear();
		
		builder.bread("any");
		LunchOrder anotherOrder = builder.build();
		System.out.println(anotherOrder);
		System.out.println(order);
	}

}
