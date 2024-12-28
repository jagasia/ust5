import java.util.Scanner;

public class AppScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		float cgpa=sc.nextFloat();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(cgpa);
	}

}
