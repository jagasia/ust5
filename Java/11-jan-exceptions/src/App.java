import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args)  {
		try(FileInputStream fis=new FileInputStream("abc.txt"))
		{
		}	//catch can be there or not, fine	
		catch(FileNotFoundException fnfe)
		{
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		Employee employee=null;
		do {
			System.out.println("Id:");
			String id=sc.next();
			System.out.println("Name:");
			String name=sc.nextLine();
			if(name.equals(""))
				name=sc.nextLine();
			System.out.println("Date Of Birth(dd-MMM-yyyy):");
			String str=sc.nextLine();
			try
			{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
			Date dateOfBirth=sdf.parse(str);
			
			employee=new Employee();
			
				employee.setId(id);
				employee.setName(name);
				employee.setDateOfBirth(dateOfBirth);
				System.out.println(employee);
			}catch(NumberFormatException ex)
			{
				System.out.println("Error: "+ex.getMessage());
				System.out.println("Please enter the details again");
			}catch(ParseException ex)
			{
				System.out.println("Error: "+ex.getMessage());
				System.out.println("Please enter the details again");
			}catch(Exception ex)
			{
				//Exception is the super class for all exception classes including checked/ unchecked
				//so it can handle any exception
				//this catch must be the last catch because it can handle any exceptioin
				//any other catch block below this would be dead code or unreachable code
			}
			finally
			{
				//what is the purpose of finally block?
				//finally block is always executed whenever the program enters the try block
				//no matter the excepton occured or not
				//no matter the exception is handled or not, finally is executed
				System.out.println("This is finally block");
			}
			
			
		}while(true);
	
	}

}
