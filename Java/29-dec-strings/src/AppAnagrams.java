import java.util.Arrays;
import java.util.Scanner;

public class AppAnagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		//write your code here
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String s1=new String(arr1);
		String s2=new String(arr2);
		
//		if(s1.equals(s2)) {
//			System.out.println("Anagrams");
//		}
//		else
//		{
//			System.out.println("Not anagrams");
//		}
		System.out.println((s1.equals(s2))?"Anagrams":"Not anagrams");
	}

}
