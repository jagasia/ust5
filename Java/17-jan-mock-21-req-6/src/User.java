import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String email;
	private String phoneNumber;
	private String location;
	private List<Purchase> purchaseList;
	
	public User() {}

	public User(String name, String email, String phoneNumber, String location, List<Purchase> purchaseList) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.purchaseList = purchaseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Purchase> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(List<Purchase> purchaseList) {
		this.purchaseList = purchaseList;
	}
	public static List<User> prefill(){
		List<User> userList=new ArrayList<>();
		userList.add(new User("Harry","harry@gmail.com","9856231478","NewYork", new ArrayList<Purchase>()));
		userList.add(new User("Joe","joe@gmail.com","8956231548","Chicago", new ArrayList<Purchase>()));
		userList.add(new User("Oliver","oliver@gmail.com","7856124589","SanFrancisco", new ArrayList<Purchase>()));
		userList.add(new User("Danny","danny@gmail.com","9382714568","Los Angeles", new ArrayList<Purchase>()));
		userList.add(new User("Brandon","brandon@gmail.com","98596215488","Boston", new ArrayList<Purchase>()));
		userList.add(new User("Rob","rob@gmail.com","9584596662","NewYork", new ArrayList<Purchase>()));
		return userList;
		}

	static User getValuableUser(List<User> userList,String month)
	{
		User valuableUser=null;
		Double highestValue=0.0;
		for(User user:userList)
		{
			Double userValue=0.0;
			for(Purchase p:user.getPurchaseList())
			{
				SimpleDateFormat sdf=new SimpleDateFormat("MMMM");	//EEEE will give you weekday like Friday
				String mnth = sdf.format(p.getPurchaseDate());	//find the month (full name) from date?
				if(mnth.equals(month))
				{
					userValue+=p.getPrice();
				}
			}
			if(userValue>highestValue)
			{
				highestValue=userValue;
				valuableUser=user;
			}
		}
		return valuableUser;		
	}
}
