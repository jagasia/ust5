import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Serializable
{
	private Integer id;
	private String name;
	private Date dateOfBirth;
	private Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dateOfBirth, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + sdf.format(dateOfBirth) + ", salary=" + salary + "]";
	}
	
}
