import java.io.IOException;
import java.io.InputStream;

public class App {

	public static void main(String[] args) throws IOException {
		Employee e=new Employee();
		e.setAddress("E1104", "Main road", "Chennai");
		
		System.out.println(e);
		
//		Runtime rt=new Runtime();	//not possible
		//we cannot create an object of Runtime. But there is already an object in itself
		Runtime rt=Runtime.getRuntime();
		//getRuntime is a static method, so can call it using classname itself
//		rt.gc(); 		//we are calling garbage collector.
		//we can use Runtime for system calls
//		rt.exec("notepad");
		//what is DIR in command prompt?
		Process x = rt.exec("netstat -aon");
		InputStream is = x.getInputStream();
		int data=-1;
		while((data=is.read())!=-1)
		{
			System.out.print((char)data);
		}
	}

}
