import java.util.Scanner;

public class AppEmail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String pattern="[A-Za-z][A-Za-z0-9_]*([.][a-z]+)?@[a-z]+[.](([a-z]{3})|([a-z]{2}[.][a-z]{2}))";
		if(input.matches(pattern))
			System.out.println("Valid email");
		else
			System.out.println("Invalid email");
	}

}
