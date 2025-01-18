import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserScore {
	private Double completionPercentage;
	private User user;
	private Course course;
	
	public UserScore() {}

	public UserScore(Double completionPercentage, User user, Course course) {
		super();
		this.completionPercentage = completionPercentage;
		this.user = user;
		this.course = course;
	}

	public Double getCompletionPercentage() {
		return completionPercentage;
	}

	public void setCompletionPercentage(Double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	static Map<String,UserScore> getTopPerformer(List<UserScore> scoreList)
	{
		Map<String,UserScore> map=new TreeMap<>();
		for(UserScore us:scoreList)
		{
			//get course from this user score
			String courseName=us.getCourse().getName();		//key
			UserScore exUserScore = map.get(courseName);
			if(exUserScore==null)
			{
				//this score is found first time. so whatever completion percentage is there is best only
				map.put(courseName, us);
			}else
			if(us.getCompletionPercentage()>exUserScore.getCompletionPercentage())
			{
				map.put(courseName, us);
			}
			
		}
		return map;
	}
}
