
public class Company {
	private static Company company;
	private String name;
	private String location;
	
	private Company() {}

	private Company(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public static Company getInstance() {
		if(company==null)
			company=new Company();
		return company;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getLocation() {
		return location;
	}

	public final void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + "]";
	}
	
	
}
