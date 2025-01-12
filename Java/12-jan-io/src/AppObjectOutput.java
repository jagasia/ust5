import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppObjectOutput {

	public static void main(String[] args) throws ParseException, IOException 
	{
		Scanner sc=new Scanner(System.in);
		Integer id=sc.nextInt();
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		String strDob=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dob=sdf.parse(strDob);
		Double salary=sc.nextDouble();
		
		Employee emp=new Employee(id, name, dob, salary);
		//to write this object into stream
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("manoj.dat"));
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		System.out.println("Written");
	}

}
