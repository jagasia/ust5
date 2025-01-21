import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Integer []arr= {5,9,2,11,22,8,4,3,15,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the item to search:");
		int item=sc.nextInt();
		//linear search
		for(int i=0;i<arr.length;i++)
		{
			if(item==arr[i])
			{
				System.out.printf("Found at index: %d",i);
				return;
			}
		}
		System.out.println("Not found");
	}

}
