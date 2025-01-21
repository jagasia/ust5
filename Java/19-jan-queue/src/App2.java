import java.util.PriorityQueue;

public class App2 {

	public static void main(String[] args) {
		PriorityQueue<Employee> q = new PriorityQueue<>((x, y) -> x.getName().compareTo(y.getName()));
		q.add(new Employee(15, "Raja", "CSE"));
		q.add(new Employee(1, "Zaheer", "IT"));
		q.add(new Employee(10, "Abdul", "CSE"));
		q.add(new Employee(16, "Ravi", "IT"));
		q.add(new Employee(8, "Babu", "IT"));

		while (!q.isEmpty())
			System.out.println(q.poll()); // guess the order?

	}

}
