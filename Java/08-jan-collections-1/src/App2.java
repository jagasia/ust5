import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws ParseException {
		List<Employee> empList=new ArrayList<>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		empList.add(new Employee(7, "Babu", sdf.parse("08-Jan-2002")));
		empList.add(new Employee(3, "Alexander", sdf.parse("01-Jun-2011")));
		empList.add(new Employee(5, "Zaheer", sdf.parse("08-Sep-2012")));
		empList.add(new Employee(2, "Suresh", sdf.parse("18-Apr-2007")));
		empList.add(new Employee(4, "Raja", sdf.parse("11-Feb-2005")));

		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do
		{
			System.out.println("1: Sort by id\r\n"
					+ "2: Sort by name\r\n"
					+ "3: Sort by date of joining\r\n"
					+ "x: Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	//by id
				Collections.sort(empList);
				break;
			case 2:	//by name
				Collections.sort(empList, new EmployeeNameComparator());
				break;
			case 3:	//by date of joining
				Collections.sort(empList, new EmployeeDateComparator());
				break;
			default:
				return;
			}
			for(Employee e:empList)
				System.out.println(e);
		}while(choice<=3);
		
	}

}
