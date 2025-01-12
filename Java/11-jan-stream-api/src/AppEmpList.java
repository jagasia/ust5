import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AppEmpList {

	public static void main(String[] args) throws ParseException {
		Set<Employee> empSet=new HashSet<>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		empSet.add(new Employee(7, "Babu", sdf.parse("08-Jan-2002"), "CSE",100000));
		empSet.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011"), "IT",100000));
		empSet.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011"), "CSE",100000));
		empSet.add(new Employee(5, "Zaheer", sdf.parse("08-Sep-2012"), "CSE",100000));
		empSet.add(new Employee(2, "Suresh", sdf.parse("18-Apr-2007"), "IT",100000));
		empSet.add(new Employee(4, "Raja", sdf.parse("11-Feb-2005"), "ECE",100000));
		
		//display dept wise sum of salary
		Map<String, IntSummaryStatistics> map = empSet.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingInt(Employee::getSalary)));
		
		for(Entry<String, IntSummaryStatistics> e:map.entrySet())
		{
			//			System.out.println(e.getKey()+"\t"+e.getValue().getSum());
			System.out.println(e);
		}
	}

}
