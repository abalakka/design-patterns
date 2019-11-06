package creational;

public class Singleton {
	private volatile static  Singleton instance = null;
	
	private Singleton() {
		if(instance != null) {
			throw new RuntimeException("use getInstance method");
		}
	}
	
	public static Singleton getInstane() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();					
				}
			}
		}
			
		return instance;
	}
}
