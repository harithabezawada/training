package com.sonata;

public class SumOfArray {

	public static void main(String agrs[]) {
		
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		System.out.println("Sum of array elements are");
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		
	}
}
