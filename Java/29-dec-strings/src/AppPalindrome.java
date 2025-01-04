import java.util.Scanner;

public class AppPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		//your code starts here

		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		String reverse=sb.toString();
		
		System.out.println(input.equalsIgnoreCase(reverse)?"Palindrome":"Not Palindrome");
	}
}
