
public class App {

	public static void main(String[] args) {
		One r1=new One();
		Two r2=new Two();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.setName("Even");
		t2.setName("Odd");

		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	}

}
