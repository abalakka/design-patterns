package structural.adadpter;

public class EmployeeDB implements IEmployee {

	private String id;
	private String name;
	
	
	public EmployeeDB(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "EmployeeDB [id=" + id + ", name=" + name + "]";
	}
	
	

}
