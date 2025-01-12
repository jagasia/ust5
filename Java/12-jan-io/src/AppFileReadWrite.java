import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppFileReadWrite {

	public static void main(String[] args) throws IOException {
		//read bytes from a file
		File f=new File("C:\\Users\\rjaga\\Pictures\\briyani1.jfif");
		int len=(int) f.length();
		byte []data=new byte[len];
		
		//File class does not offer methods to read
		FileInputStream fis=new FileInputStream(f);
		fis.read(data);
		
		//now, lets write these bytes to a new file
		File f2=new File("shyam.jfif");
		FileOutputStream fos=new FileOutputStream(f2);
		fos.write(data);
		fos.flush();	//flush and close are automatically called when program ends gracefully
		fos.close();
		System.out.println("Done. Pls check: "+f2.getAbsolutePath());
		
	}

}
