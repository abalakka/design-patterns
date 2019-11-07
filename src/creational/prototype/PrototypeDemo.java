package creational.prototype;

public class PrototypeDemo {
	
	public static void main(String[] args) {
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie");
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		
		movie.setTitle("Die hard 2");
		anotherMovie.setTitle("Die hard 4");
		
		System.out.println(movie);
		System.out.println(anotherMovie);
	}
}
