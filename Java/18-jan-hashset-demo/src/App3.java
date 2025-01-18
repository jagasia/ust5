import java.util.HashSet;

public class App3 {

	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<>();
		set.add(new Employee(25, "Raja", "IT"));
		set.add(new Employee(15, "Zaheer", "CSE"));
		set.add(new Employee(11, "Raja", "CSE"));
		set.add(new Employee(28, "Abdul", "IT"));
		set.add(new Employee(11, "Raja", "CSE"));
		set.add(new Employee(18, "Rajesh", "IT"));

		for(Employee e:set)
			System.out.println(e);
		
		System.out.println(set.size());
		
		System.out.println(set.contains(new Employee(11, "","")));
	}

}
