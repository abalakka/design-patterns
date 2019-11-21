package structural.adadpter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<IEmployee> allEmployees(){
		List<IEmployee> employees = new ArrayList<>();
		
		employees.add(new EmployeeDB("1", "DB Emp"));
		employees.add(new EmployeeLDAPAdapter(new EmployeeLDAP("2", "LDAP Emp")));
		
		return employees;
	}

}
