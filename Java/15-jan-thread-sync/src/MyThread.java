
public class MyThread extends Thread
{
	private IdGenerator idgen;
	
	public MyThread(IdGenerator idgen)
	{
		this.idgen=idgen;
	}
	
	public void run()
	{
//		loop();
		idgen.poll();
	}
	
	public void loop()
	{
		for(int i=1001;i<1010;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : " + idgen.poll());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		synchronized (idgen) {
			System.out.println(Thread.currentThread().getName()+" entered a sync block now");
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : " + idgen.poll());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" has exit the sync block");
//		}
		for(int i=2001;i<2010;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : " + idgen.poll());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
