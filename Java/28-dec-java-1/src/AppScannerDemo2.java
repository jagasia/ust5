import java.util.Scanner;

public class AppScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc2.nextLine();
		float cgpa=sc.nextFloat();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(cgpa);
	}

}
