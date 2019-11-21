package structural.adadpter;

public class EmployeeLDAPAdapter implements IEmployee {

	private EmployeeLDAP employeeLdap;
	
	public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
		this.employeeLdap = employeeLDAP;
	}
	
	@Override
	public String getId() {
		return this.employeeLdap.getCn();
	}

	@Override
	public String getName() {
		return this.employeeLdap.getGivenName();
	}

	@Override
	public String toString() {
		return "EmployeeLDAPAdapter [employeeLdap=" + employeeLdap + "]";
	}

	
}
