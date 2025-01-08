import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Employee
{
	private Integer id;
	private String name;
	private Date dateOfJoining;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dateOfJoing) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoing;
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

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoining=" + sdf.format(dateOfJoining) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}
	
}
