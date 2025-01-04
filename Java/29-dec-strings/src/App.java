import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//take a lowercase copy of input
		String str=input.toLowerCase();
		//iterate the String for each char in it
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			default:
				System.out.print(c);
			}
		}
	}

}
