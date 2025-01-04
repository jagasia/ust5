import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppNSmallestElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfElements=sc.nextInt();
		int []arr=new int[noOfElements];
		for(int i=0;i<noOfElements;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int clone[]=new int[noOfElements];
		clone=Arrays.copyOf(arr, noOfElements);
//		System.out.println("The cloned array is :");
//		System.out.println(Arrays.toString(clone));
		Arrays.sort(clone);
		
		clone=Arrays.copyOf(clone, n);
//		System.out.println("After truncate: clone is :");
//		System.out.println(Arrays.toString(clone));
		
		boolean isFirst=true;
		for(int i=0;i<noOfElements;i++)
		{
			//check if current element is present in clone
			for(int j=0;j<clone.length;j++)
			{
				if(arr[i]==clone[j])
				{					
					if(!isFirst)
						System.out.print(' ');
					System.out.print(arr[i]);
					isFirst=false;
					break;
				}
				
			}
		}
	}

}
