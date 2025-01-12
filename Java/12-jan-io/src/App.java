import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File f=new File("ayush.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error creating the file");
		}
		System.out.println("File is created:"+f.getAbsolutePath());
	}

}
