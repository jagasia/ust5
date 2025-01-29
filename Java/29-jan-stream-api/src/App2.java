import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) throws ParseException {
		List<Employee> empList=new ArrayList<>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		empList.add(new Employee(7, "Babu", sdf.parse("08-Jan-2002")));
		empList.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011")));
		empList.add(new Employee(5, "Zaheer", sdf.parse("08-Sep-2012")));
		empList.add(new Employee(2, "Suresh", sdf.parse("18-Apr-2007")));
		empList.add(new Employee(4, "Raja", sdf.parse("11-Feb-2005")));

		empList.stream()
		.map((e)->e.getName())
		.forEach(System.out::println);
	}

}
