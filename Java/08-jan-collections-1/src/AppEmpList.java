import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AppEmpList {

	public static void main(String[] args) throws ParseException {
		Set<Employee> empSet=new HashSet<>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		empSet.add(new Employee(7, "Babu", sdf.parse("08-Jan-2002")));
		empSet.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011")));
		empSet.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011")));
		empSet.add(new Employee(5, "Zaheer", sdf.parse("08-Sep-2012")));
		empSet.add(new Employee(2, "Suresh", sdf.parse("18-Apr-2007")));
		empSet.add(new Employee(4, "Raja", sdf.parse("11-Feb-2005")));
		
		//Collections.sort cannot be used for Set
		//how many elements are added to empSet
		for(Employee e:empSet)
		{
			System.out.println(e);
		}
	}

}
