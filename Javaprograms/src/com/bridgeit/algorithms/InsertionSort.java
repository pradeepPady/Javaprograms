package com.bridgeit.algorithms;

import com.bridgeit.utility.Utility;

public class InsertionSort 
{
public static void main(String[] args) 
{
	Utility utility=new Utility();
	System.out.print("Enter the lenth of array\n");
	int length=utility.IntegerInput();
	String array[]=new String[length];
	System.out.println("Enter the elements");
	for(int i=0;i<length;i++)
	{
		array[i]=utility.StringInput();
	}
	SearchAndSortUsinGenerics.insertionSort(array,0,length);
}
}
