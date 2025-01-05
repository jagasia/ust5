import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppDateExamples {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		//we don't want to accept invalid date
		sdf.setLenient(false);
		Date dt=sdf.parse(str);
		
//		System.out.println(dt);
		
		//now display date is same format. for that convert Date into String
		System.out.println(sdf.format(dt));
	}

}
