import java.util.Arrays;
import java.util.Date;

interface Person
{
	void speak();	//public by default
	default void run()
	{
		System.out.println("Person runs");
	}
	static void listen()
	{
		System.out.println("Person listen");
	}
}

class Employee implements Person
{
	public void speak()	//error because, you cannot reduce the visibility during overriding
	{
		System.out.println("Employee speaks");
	}
	public void run()
	{
		System.out.println("Employee runs");
	}
	
	public static void listen()
	{
		System.out.println("Employee listen");
		Object []arr=new Object[10];
		arr[0]=new Integer(20);
		arr[1]="India";
		arr[2]=new Date();
		
		System.out.println(Arrays.toString(arr));
		
	}
}

public class App
{
	public static void main(String []args)
	{
		Person raja=new Employee();
//		raja.speak();
		raja.run();
		Employee.listen();
		Person.listen();
	}
}
