import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College implements Comparable<College>
{
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;

	public College() {}

	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	static College createCollege(String detail) throws ParseException
	{
//		IIT Guwahati,www.iitg.ac.in/,9876543214,Govt of India,10,Guwahati,17-05-1994
		String[] arr = detail.split(",");		//if , is a regex symbol, then use [,]	or \\,
		College college=new College();
		college.setName(arr[0]);
		college.setWebsite(arr[1]);
		college.setMobile(arr[2]);
		college.setFounder(arr[3]);
		college.setNumberOfDept(Integer.valueOf(arr[4])); //Integer.parseInt returns int and not Integer. So i use valueOf
		college.setLocation(arr[5]);
		//how to convert String into java.util.Date?
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date startingDate=sdf.parse(arr[6]);
		college.setStartingDate(startingDate);
		
		
		return college;	
	}

	@Override
	public int compareTo(College o) {
		return this.getName().compareTo(o.getName());
	}
}
