
public class App {

	public static void main(String[] args) {
		One t1=new One();
		Two t2=new Two();
		
		t1.setName("Even");
		t2.setName("Odd");
		
		t1.start();
		t2.start();
		
	}

}
