import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppDataInput {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(new FileInputStream("thakur.dat"));
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		
	}

}
