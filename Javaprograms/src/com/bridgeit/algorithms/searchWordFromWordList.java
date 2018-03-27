/****************************************************************************************************************************
 * Purpose:Reading the words form the file and searching the words if words found then pop it else added it
 *     
 *         
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 * 
 ****************************************************************************************************************************/
package com.bridgeit.algorithms;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class searchWordFromWordList {

	public static void main(String[] args) throws Exception {
		String stringArray[] = null;
		Utility utility = new Utility();
		stringArray=utility.fileReading();
		Arrays.sort(stringArray);
		utility.write(stringArray);
		System.out.println("After sorting: "+Arrays.toString(stringArray));
		System.out.println();
		System.out.println("Enter the key element to search");
		String key = utility.StringInput();
		
		boolean flag = utility.binarySearch(stringArray, 0, stringArray.length - 1, key);
		if (flag) 
		{
			System.out.println("Element found");
		} else 
		{
			System.out.println("Element Not Found");
		}
		
	}

}
