import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user 1 detail:");
		String detail1=sc.nextLine();
		
		System.out.println("Enter user 2 detail:");
		String detail2=sc.nextLine();
		
//		Oliver,oliver@gmail.com,7856124589,SanFrancisco
//		can we split the above string by ,
		
		String[] arr1 = detail1.split(",");	//reg ex. since , is not a symbol, it is fine
		User user1=new User();
		user1.setName(arr1[0]);
		user1.setEmail(arr1[1]);
		user1.setPhoneNumber(arr1[2]);
		user1.setLocation(arr1[3]);
		
		String[] arr2 = detail2.split(",");
		User user2=new User(arr2[0], arr2[1], arr2[2], arr2[3]);
		
		System.out.println("User 1");
		System.out.println(user1);

		System.out.println("User 2");
		System.out.println(user2);

//		if(user1.equals(user2))
//		{
//			System.out.println("User 1 is same as User 2");
//		}else
//		{
//			System.out.println("User 1 and User 2 are different");
//		}
//		
		
		System.out.println((user1.equals(user2))?"User 1 is same as User 2":"User 1 and User 2 are different");
		
	}

}
