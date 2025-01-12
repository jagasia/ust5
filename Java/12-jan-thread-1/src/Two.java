
public class Two extends Thread
{

	@Override
	public void run() {
		for(int i=101;i<120;i+=2)
		{
			System.out.println(getName()+"\t"+i);
			try {
				Thread.sleep(1000);		//1000 millisecond
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
