import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppScanner {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("ayush.txt");
		System.out.println(f.length());
		Scanner sc=new Scanner(f);			//
		System.out.println(sc.nextLine());
	}
}
