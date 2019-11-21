package structural.adadpter;

import java.util.List;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<IEmployee> employees = client.allEmployees();
		
		System.out.println(employees);
	}
}
