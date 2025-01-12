
public class App4 {

	public static void main(String[] args) {
		Arithmetic a=new Arithmetic(1);
		Arithmetic b=new Arithmetic(100);
		Thread t1=new Thread(a::display);
		Thread t2=new Thread(b::display);
		
		
		t1.start();
		t2.start();
	}

}
