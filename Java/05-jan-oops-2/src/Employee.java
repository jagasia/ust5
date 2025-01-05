
public class Employee extends Person {
	private String employeeId;
	private Address address;
	

	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, String employeeId)
	{
		this(name);	//why?	instead of super(name)
		this.employeeId=employeeId;
	}

	public Employee()
	{
		super("");
	}
	
	class Address
	{
		String dno;
		String street;
		String city;
		
		private Address() {}

		@Override
		public String toString() {
			return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
		}
		
		
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(String dno, String street, String city) {
		Address a=new Address();
		a.dno=dno;
		a.street=street;
		a.city=city;
		this.address = a;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", address=" + address + "]";
	}
	
	
}
