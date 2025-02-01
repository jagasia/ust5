
public class AppClone {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(100);
		e1.setName("Ravi");
		
		Employee e2 = e1.clone();
		e2.setName("Abdul");
		System.out.println(e1);
	}

}
