/***********************************************************************************
 * Purpose:binary search for string and integer using generic,
 *         bubble sort for integer and string,
 *         insertion sort for integer and string using generics
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 * 
 ***********************************************************************************/
package com.bridgeit.algorithms;

public class SearchAndSortUsinGenerics 
{
	public static <T extends Comparable<T>>boolean binarySearch(T array[],int low,int high,T key) 
	{
		if(low==high)
		{
			if(key.compareTo(array[low])==0)
				return true;
			else
				return false;
		}
		else
		{
			if(low<=high)
			{
				int mid=low+high/2;
				if(key.compareTo(array[mid])==0)
				{
					return true;
				}
				else if(key.compareTo(array[mid])>0)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
				
			}
		}
	return false;
		
		
	}
	public static <T extends Comparable<T>>void insertionSort(T array[],int low,int high)
	{
		int length=array.length;
		for (int i = 0; i < length; i++) {
			T key = array[i];
			int j = i - 1;
			while ((j >= 0) && (array[j].compareTo(key) > 0)) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		System.out.println("Elements ofter insertion sort");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
