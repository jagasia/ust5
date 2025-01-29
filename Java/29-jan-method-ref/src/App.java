class Counter
{
	String message;
	public Counter() {}
	
	public Counter(String message) {
		super();
		this.message = message;
	}

	public void count() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(message+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class A implements Runnable
{

	@Override
	public void run() {
		Counter c1=new Counter("Good Morning");
		c1.count();
	}
	
}

public class App {

	public static void main(String[] args) {
		Counter c1=new Counter("Good Morning");
		Thread t1=new Thread(c1::count);
		Counter c2=new Counter("Good Evening");
		Thread t2=new Thread(c2::count);
		t1.start();
		t2.start();
	}

}
