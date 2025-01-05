
public class App2 {

	public static void main(String[] args) {
//		Sun sun=new Sun();		not possible
		Sun s = Sun.getInstance();
		//we got an object
		s.setName("Sooriyan");
		
		Sun s2=Sun.getInstance();
		s2.setName("Surya");
		
		System.out.println(s.getName());
		System.out.println();
	}

}
