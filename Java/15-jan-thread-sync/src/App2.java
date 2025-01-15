class YourThread extends Thread
{
	public void run()
	{
		int x=10;
		if(Thread.currentThread().getName().equals("First"))
			x=15;
		for(int i=0;i<x;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App2
{
	public static void main(String[] args) throws InterruptedException {
		YourThread t1=new YourThread();
		YourThread t2=new YourThread();
		YourThread t3=new YourThread();
		
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		
		
		t1.start();
		t2.start();
		t1.join();	//whoever started shall complete. others wait, do not start until them
		t3.start();
		
	}
}