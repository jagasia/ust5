
public class App {

	public static void main(String[] args) {
		IdGenerator i1=new IdGenerator();
		MyThread t1=new MyThread(i1);
		MyThread t2=new MyThread(i1);
		
		//both t1 and t2 threads access same object
		//shared resource here, is i1
		
		t1.setName("First thread");
		t2.setName("2nd thread");
		
		t1.start();
		t2.start();
	}

}
