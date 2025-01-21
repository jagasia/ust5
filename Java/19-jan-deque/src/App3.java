import java.util.ArrayDeque;

public class App3 {

	public static void main(String[] args) {
		ArrayDeque<Employee> q=new ArrayDeque<>();
		q.add(new Employee(11, "Ram", "IT"));
		q.add(new Employee(5, "Ram", "IT"));
//		q.add(null);
		q.add(new Employee(10, "Ram", "IT"));
//		q.add(null);
		q.add(new Employee(3, "Ram", "IT"));
		q.add(new Employee(9, "Ram", "IT"));
		//can we add null to array dequeue? is it allowed?
		
		
		while(!q.isEmpty())
			System.out.println(q.poll());
	}

}
