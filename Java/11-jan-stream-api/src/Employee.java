import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private Date dateOfJoining;
	private String department;
	private Integer salary;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dateOfJoing) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoing;
	}
	

	public Employee(Integer id, String name, Date dateOfJoining, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoing) {
		this.dateOfJoining = dateOfJoing;
	}
	
	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", department="
				+ department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		//a.compareTo(b)		this.compareTo(argument)
//		return this.getDateOfJoing().compareTo(o.getDateOfJoing());
//		return this.getId().compareTo(o.getId());
//		return this.getId()-o.getId();
		return o.getId()-this.getId();
		//because, Date class already implements Comparable so it has compareTo method
	}
	
}
