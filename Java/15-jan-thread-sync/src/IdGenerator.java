
public class IdGenerator {
	int start=1;
	public synchronized int poll()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() +" : "+ start++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return start++;
	}
}
