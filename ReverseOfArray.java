package com.sonata;

public class ReverseOfArray {
	
	public static void main(String args[]) {
		
	int[] arr = new int[] {2,4,6,3,1,5};
	System.out.println("Reversed array is ");
	for(int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i] +"");
	}
	}
}

