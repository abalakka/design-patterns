package creational.singleton;

public class SingletonDemo {
	
	public static void main(String[] args) {
		Singleton first = Singleton.getInstane();
		System.out.println(first);
		
		Singleton second = Singleton.getInstane();
		System.out.println(second);
		
		System.out.println(first == second);
	}

}
