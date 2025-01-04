import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppReg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String patternMobile="\\d{10}";
		Pattern p=Pattern.compile(patternMobile);
		Matcher m = p.matcher(input);
		while(m.find())
			System.out.println(m.group());
	}

}
