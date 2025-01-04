import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfElements=sc.nextInt();
		char arr[]=new char[noOfElements];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
	
		int n=sc.nextInt();
		char result='\0';
		for(int i=0;i<noOfElements -1;i++)
		{
			int count=1;
			for(int j=i+1;j<noOfElements;j++)
			{
//				System.out.printf("%c vs %c\n",arr[i],arr[j]);
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
//			System.out.println(arr[i]+" occurs "+count+" times");
			if(count==n)
			{
				result=arr[i];
			}
		}
		System.out.println("The result is "+((result!='\0')?result:-1));
	}

}
