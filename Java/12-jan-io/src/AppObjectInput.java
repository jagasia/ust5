import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AppObjectInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("manoj.dat"));
		Employee e = (Employee) ois.readObject();
		System.out.println(e);
	}

}
