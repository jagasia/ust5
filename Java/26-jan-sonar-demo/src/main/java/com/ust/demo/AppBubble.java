package com.ust.demo;
import java.util.Arrays;

public class AppBubble {

	public static void bubbleSort(Integer []arr)
	{
		//write your code here
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1])
				{
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println("hi");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Integer []arr= {5,9,2,11,22,8,4,3,15,10};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
