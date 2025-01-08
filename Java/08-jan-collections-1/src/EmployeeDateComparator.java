import java.util.Comparator;

public class EmployeeDateComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
	}

}
