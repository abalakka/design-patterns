package structural.adadpter;

public class EmployeeLDAP {
	private String cn;
	private String givenName;
	
	public EmployeeLDAP(String cn, String givenName) {
		super();
		this.cn = cn;
		this.givenName = givenName;
	}

	public String getCn() {
		return cn;
	}

	public String getGivenName() {
		return givenName;
	}

	@Override
	public String toString() {
		return "EmployeeLDAP [cn=" + cn + ", givenName=" + givenName + "]";
	}
	
	
	

}
