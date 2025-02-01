
public class App {

	public static void main(String[] args) {
		System.out.println("Hello world");
//		Company c=new Company();
		Company c=Company.getInstance();
		c.setName("A");
		c.setLocation("Thiruvananthapuram");
		
//		Company c2=new Company();
		Company c2 = Company.getInstance();
		c2.setName("B");
		c2.setLocation("Cochin");
		
		System.out.println(c.getName()); //what is the output?
		System.out.println(c.getLocation());
		//c, c2 both are same objects
	}

}
