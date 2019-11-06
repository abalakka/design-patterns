package creational.builder;

public class LunchOrder {

	public static class Builder {
		private String bread;
		private String dressing;
		
		public Builder() {
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public void clear() {
			this.bread = "";
			this.dressing = "";
		}
	}
	
	private final String bread;
	private final String dressing;
	
	public LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.dressing = builder.dressing;
	}
	
	public String getBread() {
		return bread;
	}
	public String getDressing() {
		return dressing;
	}

	@Override
	public String toString() {
		return "LunchOrder [bread=" + bread + ", dressing=" + dressing + "]";
	}
	
	
}
