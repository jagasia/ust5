import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppLinkedListEmp {

	public static void main(String[] args) throws ParseException {
//		JLinkedList<String> list=new JLinkedList<>();
//		list.addNode("India");
//		list.addNode("Australia");
//		list.addNode("Srilanka");
//		list.addNode("Japan");
//		list.addNode("China");
//		
//		list.deleteNode("Srilanka");
//		
//		list.display();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		JLinkedList<Employee> list=new JLinkedList<>();
		list.addNode(new Employee(12, "Jag", sdf.parse("11-Jun-2000")));
		list.addNode(new Employee(1, "Raja", sdf.parse("04-Jun-2000")));
		list.addNode(new Employee(3, "Siva", sdf.parse("07-Jun-2000")));
		list.addNode(new Employee(4, "Kumar", sdf.parse("12-Jun-2000")));
		list.addNode(new Employee(2, "Abdul", sdf.parse("09-Jun-2000")));
		
		list.deleteNode(new Employee(13, "Siva", sdf.parse("07-Jun-2000")));
		
		list.display();
		
		
	}

}
