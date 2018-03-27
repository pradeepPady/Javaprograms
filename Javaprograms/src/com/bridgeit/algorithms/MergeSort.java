package com.bridgeit.algorithms;

import com.bridgeit.utility.Utility;

class MergeSort
{  
	public static void main(String args[])
    {
    	Utility utility=new Utility();
    	System.out.print("Enter the length\n");
    	int length=utility.IntegerInput();
    	String array[]=new String[length];
        System.out.print("\t\t\tEnter the elements\n");
        for(int i=0;i<array.length;i++)
        {
         array[i]=utility.StringInput();
        }
        System.out.print("\t\t\tGiven Array: \n");
        utility.printArray(array);
        utility.sort(array, 0, array.length-1);
        System.out.print("\t\t\tSorted array: \n");
        utility.printArray(array);
    }
}
