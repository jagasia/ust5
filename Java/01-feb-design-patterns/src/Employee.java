
public class Employee {
	private Integer id;
	private String name;
	public Employee() {}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public Employee clone()
	{
//		return this;	//not a clone. ref to existing object
		return new Employee(id, name);	// a new object having same values
	}
}
