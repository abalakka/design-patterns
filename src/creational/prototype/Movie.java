package creational.prototype;

public class Movie extends Item{
	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "Movie [runTime=" + runTime + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice()
				+ "]";
	}
	
	
	
}
