
public class Arithmetic {
	int start=0;
	public Arithmetic() {}
	
	public Arithmetic(int start) {
		super();
		this.start = start;
	}

	public void display() 
	{
		for(int i=start;i<start+20;i+=2)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
