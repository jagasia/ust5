import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppReadWrite1By1 {

	public static void main(String[] args) throws IOException //, InterruptedException 
	{
		File f1=new File("C:\\Users\\rjaga\\Pictures\\friedrice.jpg");
		File f2=new File("abdul.jpg");
		
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream(f2);
		
		int data=-1;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			fos.flush();
//			Thread.sleep(100);
		}
		fos.close();
		System.out.println("Write completed: "+f2.getAbsolutePath());
	}

}
