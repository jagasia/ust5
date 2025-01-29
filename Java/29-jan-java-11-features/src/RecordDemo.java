record User(String username, String password) {}
public class RecordDemo {

	public static User method()
	{
		//i want to return one object containing 2 properties
		return new User("raja","suresh");
	}
	
	public static void main(String[] args) {
		User user = method();
//		user.username=""	it is final
		System.out.println(method());
	}

}
