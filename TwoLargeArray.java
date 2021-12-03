package com.sonata;

public class TwoLargeArray {
	public static void main (String[] args)
	{


	int array[] = {4,9,55,99,7,6,7};

	int largest1, largest2, temp;

	largest1 = array[0];
	largest2 = array[1];

	if (largest1 < largest2)
	{
	temp = largest1;
	largest1 = largest2;
	largest2 = temp;
	}

	for (int i = 2; i < array.length; i++)
	{
	if (array[i] > largest1)
	{
	largest2 = largest1;
	largest1 = array[i];
	}
	else if (array[i] > largest2 && array[i] != largest1)
	{
	largest2 = array[i];
	}
	}

	System.out.println ("The First largest is " + largest1);
	System.out.println ("The Second largest is " + largest2);

	}



	}

