
public class App3 {

	private static void method1(String message)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+message);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Thread t1=new Thread(()->{
			method1("Hello");
		});
		Thread t2=new Thread(()->{
			method1("Hi");
		});
		
		t1.start();
		t2.start();
	}

}
