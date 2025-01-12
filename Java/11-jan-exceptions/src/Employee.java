import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private String id;
	private String name;
	private Date dateOfBirth;
	
	public Employee() {}

	public Employee(String id, String name, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
//		starts with E and followed by 3 digits	
		if(!id.matches("E[0-9]{3}"))
			throw new NumberFormatException("Id is invalid");	//we will introduce our own exceptions in next sessioin
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
//		must be atleast 3 characters and first should be captial letter. No numbers
		if(!name.matches("[A-Z][A-Za-z]{2,}"))
			throw new NumberFormatException("Name is invalid");
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
//		must not be future date
		if(dateOfBirth.after(new Date()))
			throw new NumberFormatException("Date of Birth cannot be future date");
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + sdf.format(dateOfBirth) + "]";
	}
	
}
