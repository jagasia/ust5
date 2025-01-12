import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppDataOutput {

	public static void main(String[] args) throws IOException {
		int i=20;
		float f=1.2f;
		
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("thakur.dat"));
		dos.writeInt(i);
		dos.writeFloat(f);
		
		dos.flush();
		dos.close();
		System.out.println("Data written into thakur.dat");
	}

}
