import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of user scores:");
		int n=sc.nextInt();
		List<UserScore> userScoreList=new ArrayList<>();
		List<User> userList = User.prefill();
		List<Course> courseList = Course.prefill();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
//			95.2,Harry,JavaScript
			//Harry is name of the user. But we need user object
			User user=null;
			for(User u:userList)
			{
				if(u.getName().equals(arr[1]))
				{
					user=u;
					break;
				}
			}
			Course course=null;
			for(Course c : courseList)
			{
				if(c.getName().equals(arr[2]))
				{
					course=c;
					break;
				}
			}
			UserScore us=new UserScore(Double.valueOf(arr[0]), user, course);
			userScoreList.add(us);
		}
		Map<String, UserScore> map = UserScore.getTopPerformer(userScoreList);
		System.out.format("%-15s %s\n","Course","Top performer");
		for(Entry<String, UserScore> e:map.entrySet())
			System.out.format("%-15s %s\n",e.getKey(),e.getValue().getUser().getName());
	}

}
