import java.util.Scanner;

public class Chair extends Furniture
{
	private int noOfLegs;
	
	public void acceptDetails()
	{
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of legs:");
		noOfLegs=sc.nextInt();
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of legs:"+noOfLegs);
	}
	
	public void roll()
	{
		System.out.println("Chair is rolling");
	}
}
