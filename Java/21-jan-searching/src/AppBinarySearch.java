import java.util.Arrays;
import java.util.Scanner;

public class AppBinarySearch {
	
	public static void binarySearch(Integer []arr,int searchValue, int left, int right)
	{
		if(left>right)
		{
			System.out.println("Not Found");
			return;
		}
		int mid=(left+right)/2;
		int element=arr[mid];
		
		//check if element at mid index matches searchValue
		System.out.println("Comparing "+searchValue+" with mid "+element);
		if(searchValue==element)
		{
			System.out.println("Found");
			return;
		}else if(searchValue<element)
		{
			System.out.printf("Moving left: x=%d and y=%d\n", left, mid-1);
			binarySearch(arr, searchValue, left, mid-1);
		}else
		{
			System.out.printf("Moving right: x=%d and y=%d\n", mid+1, right);
			binarySearch(arr, searchValue, mid+1, right);
		}
	}

	public static void main(String[] args) {
		Integer []arr= {5,9,2,11,22,8,4,3,15,10};
		Scanner sc=new Scanner(System.in);
		//in order to do binary search, we sort the array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the item to search:");
		int item=sc.nextInt();
		
		binarySearch(arr,item, 0, arr.length-1);
		
	}
}
