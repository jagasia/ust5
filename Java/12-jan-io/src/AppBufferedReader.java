import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppBufferedReader {

	public static void main(String[] args) throws IOException {
//		BufferedInputStream bis=new BufferedInputStream(System.in);
//		int x=bis.read();
//		System.out.println("Your input was "+x);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("Your input is "+str);
	}

}
