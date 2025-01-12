import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class App3 {

	public static void main(String[] args) throws IOException {
		File f=new File("jag.txt");
		FileReader fr=new FileReader(f);
		int len=(int) f.length();
		char arr[]=new char[len];
		fr.read(arr);
		String str=new String(arr);
		System.out.println(str);
		//how to convert JSON into Java object?
		
//		Gson gson=new Gson();
//		Employee emp = gson.fromJson(str, Employee.class);
//		
//		System.out.println(emp);
		
		
		
	}

}
