import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class A implements Predicate<Employee>{

	@Override
	public boolean test(Employee t) {
		return t.getName().length()<5;
	}
	
}

public class App3 {

	public static void main(String[] args) throws ParseException {
		List<Employee> empList=new ArrayList<>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		empList.add(new Employee(7, "Babu", sdf.parse("08-Jan-2002"), "ECE",100000));
		empList.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011"), "IT",100000));
		empList.add(new Employee(5, "Zaheer", sdf.parse("08-Sep-2012"), "IT",100000));
		empList.add(new Employee(2, "Suresh", sdf.parse("18-Apr-2007"), "CSE",100000));
		empList.add(new Employee(4, "Raja", sdf.parse("11-Feb-2005"), "CSE",100000));

		Map<String, Integer> map = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));
		
		for(Entry<String, Integer> e:map.entrySet())
			System.out.println(e);
	}

}
